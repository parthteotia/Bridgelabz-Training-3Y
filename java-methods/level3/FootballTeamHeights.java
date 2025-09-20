import java.util.Random;

public class FootballTeamHeights {

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }
        System.out.print("Heights of players (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
