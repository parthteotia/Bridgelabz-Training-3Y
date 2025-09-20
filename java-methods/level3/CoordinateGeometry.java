import java.util.Scanner;

/**
 * This program calculates the Euclidean distance and the equation of a line
 * given two points (x1, y1) and (x2, y2).
 */
public class CoordinateGeometry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Coordinate Geometry Calculator ---");

        // Get coordinates for the first point
        System.out.print("Enter x-coordinate of the first point (x1): ");
        double x1 = input.nextDouble();
        System.out.print("Enter y-coordinate of the first point (y1): ");
        double y1 = input.nextDouble();

        // Get coordinates for the second point
        System.out.print("\nEnter x-coordinate of the second point (x2): ");
        double x2 = input.nextDouble();
        System.out.print("Enter y-coordinate of the second point (y2): ");
        double y2 = input.nextDouble();

        System.out.println("\n--- Results ---");

        // 1. Calculate and display the Euclidean distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.4f%n", distance);

        // 2. Calculate and display the equation of the line
        findAndDisplayEquation(x1, y1, x2, y2);
        
        input.close();
    }

    /**
     * Calculates the Euclidean distance between two points using the formula:
     * distance = sqrt((x2-x1)^2 + (y2-y1)^2)
     *
     * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     * @return The Euclidean distance as a double.
     */
    public static double findDistance(double x1, double y1, double x2, double y2) {
        // Calculate the difference in x and y coordinates
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        // Use Math.pow() to square the differences
        double squaredX = Math.pow(deltaX, 2);
        double squaredY = Math.pow(deltaY, 2);

        // Use Math.sqrt() to find the square root of the sum
        double distance = Math.sqrt(squaredX + squaredY);

        return distance;
    }
    
    /**
     * Finds the equation of a line (y = mx + b) given two points.
     * It handles the special case of a vertical line where the slope is undefined.
     * * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     */
    public static void findAndDisplayEquation(double x1, double y1, double x2, double y2) {
        // Check for a vertical line to avoid division by zero
        if (x1 == x2) {
            System.out.println("Equation of the line: x = " + x1);
            System.out.println("(This is a vertical line with an undefined slope.)");
            return;
        }

        double[] lineComponents = findLineEquation(x1, y1, x2, y2);
        double slope = lineComponents[0];
        double yIntercept = lineComponents[1];

        // Formatting the output to be clean, especially for negative y-intercepts.
        if (yIntercept >= 0) {
            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", slope, yIntercept);
        } else {
            // If y-intercept is negative, print with a minus sign instead of "+ -"
            System.out.printf("Equation of the line: y = %.2fx - %.2f%n", slope, Math.abs(yIntercept));
        }
    }

    /**
     * Computes the slope (m) and y-intercept (b) of a line.
     *
     * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     * @return A double array where index 0 is the slope and index 1 is the y-intercept.
     */
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b) using the point-slope form: y - y1 = m(x - x1)
        // Which rearranges to b = y1 - m*x1
        double yIntercept = y1 - slope * x1;
        
        return new double[]{slope, yIntercept};
    }
}
