import java.util.Scanner;

public class FactorsProgram {

    // Method to get factors in an array
    public static int[] getFactors(int n) {
        int count = 0;

        // Count factors first
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int idx = 0;

        // Store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }

    // Sum of factors
    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    // Product of factors
    public static long productFactors(int[] arr) {
        long prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }

    // Sum of squares of factors
    public static int sumSquares(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Sum of Squares = " + sumSquares(factors));
        System.out.println("Product = " + productFactors(factors));
    }
}
