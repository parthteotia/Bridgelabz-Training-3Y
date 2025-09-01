import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
        } else {
            // Formula method
            int formulaSum = n * (n + 1) / 2;

            // For loop method
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare and print results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Results do not match!");
            }
        }
    }
}
