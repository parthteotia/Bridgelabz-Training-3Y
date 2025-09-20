import java.util.Scanner;

/**
 * This program takes the number of students as input, generates random marks
 * for them in Physics, Chemistry, and Math, and then calculates and displays
 * their total, average, and percentage scores in a scorecard format.
 */
public class StudentScorecard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Student Scorecard Generator ---");
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Please enter a positive number for students.");
            input.close();
            return;
        }

        // 1. Generate random scores for all students.
        int[][] scores = generateRandomScores(numStudents);

        // 2. Calculate the total, average, and percentage for each student.
        double[][] results = calculateResults(scores);

        // 3. Display the final scorecard.
        displayScorecard(scores, results);
        
        input.close();
    }

    /**
     * Generates a 2D array with random 2-digit scores (from 10 to 99) for
     * Physics, Chemistry, and Math for a given number of students.
     *
     * @param numStudents The number of students to generate scores for.
     * @return A 2D integer array where scores[i][0] is Physics, [i][1] is Chemistry,
     * and [i][2] is Math for student i.
     */
    public static int[][] generateRandomScores(int numStudents) {
        System.out.println("\nGenerating random scores for " + numStudents + " students...");
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            // Generate a random 2-digit score (10-99) for Physics
            scores[i][0] = (int) (Math.random() * 90) + 10;
            // Generate a random 2-digit score (10-99) for Chemistry
            scores[i][1] = (int) (Math.random() * 90) + 10;
            // Generate a random 2-digit score (10-99) for Math
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    /**
     * Calculates the total, average, and percentage for each student's scores.
     * The results are rounded to two decimal places.
     * Note: Assuming max marks are 100 per subject, average and percentage are numerically the same.
     *
     * @param scores The 2D array containing the PCM scores for all students.
     * @return A 2D double array containing the total, average, and percentage for each student.
     */
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            // Percentage = (Total Score / Max Score) * 100 = (total / 300) * 100 = total / 3.0
            double percentage = average;

            // Store the calculated values
            results[i][0] = total;
            // Round average and percentage to 2 decimal places using Math.round()
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    /**
     * Displays the full scorecard in a well-formatted table.
     *
     * @param scores  The 2D array of original PCM scores.
     * @param results The 2D array of calculated total, average, and percentage.
     */
    public static void displayScorecard(int[][] scores, double[][] results) {
        int numStudents = scores.length;
        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tSTUDENT SCORECARD");
        System.out.println("------------------------------------------------------------------------------------------");
        // Header
        System.out.printf("%-12s | %-10s | %-12s | %-10s | %-10s | %-10s | %-15s%n",
                "Student #", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage (%)");
        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-12d | %-10d | %-12d | %-10d | %-10.0f | %-10.2f | %-15.2f%n",
                    (i + 1),
                    scores[i][0],      // Physics
                    scores[i][1],      // Chemistry
                    scores[i][2],      // Math
                    results[i][0],     // Total
                    results[i][1],     // Average
                    results[i][2]);    // Percentage
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

