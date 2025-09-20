import java.util.Arrays;

public class FactorChecker {

    // Method to find factors of a number and return them as an array
    public static int[] getFactors(int num) {
        // First loop: count factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        // Second loop: store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find the product of cube of factors
    public static double productOfCubeFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method to test
    public static void main(String[] args) {
        int num = 12; // Example number
        int[] factors = getFactors(num);

        System.out.println("Number: " + num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubeFactors(factors));
    }
}
