public class NumbrChecker {

    // Method to calculate sum of proper divisors of a number
    public static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor (for num > 1)
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return (num == 1) ? 0 : sum; // For 1, no proper divisors
    }

    // Method to check if number is Perfect
    public static boolean isPerfect(int num) {
        return num > 0 && sumOfDivisors(num) == num;
    }

    // Method to check if number is Abundant
    public static boolean isAbundant(int num) {
        return num > 0 && sumOfDivisors(num) > num;
    }

    // Method to check if number is Deficient
    public static boolean isDeficient(int num) {
        return num > 0 && sumOfDivisors(num) < num;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Method to check if number is Strong
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method for testing
    public static void main(String[] args) {
        int num = 28; // Example number

        System.out.println("Number: " + num);
        System.out.println("Is Perfect? " + isPerfect(num));
        System.out.println("Is Abundant? " + isAbundant(num));
        System.out.println("Is Deficient? " + isDeficient(num));
        System.out.println("Is Strong? " + isStrong(num));
    }
}
