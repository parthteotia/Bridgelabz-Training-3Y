import java.util.Arrays;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store the digits of the number in an array
    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }

        // Reconstruct number from digits
        int num = 0;
        for (int d : digits) {
            num = num * 10 + d;
        }
        return sum == num;
    }

    // Method to find largest and second largest digit
    public static void findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest = " + first + ", Second Largest = " + (second == Integer.MIN_VALUE ? "None" : second));
    }

    // Method to find smallest and second smallest digit
    public static void findSmallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest = " + first + ", Second Smallest = " + (second == Integer.MAX_VALUE ? "None" : second));
    }

    // Main method to test all
    public static void main(String[] args) {
        int num = 153; // Example number

        System.out.println("Number: " + num);

        // Count digits
        System.out.println("Count of digits: " + countDigits(num));

        // Get digits
        int[] digits = getDigits(num);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Check duck number
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        // Check Armstrong number
        System.out.println("Is Armstrong Number? " + isArmstrong(digits));

        // Largest and second largest
        findLargestTwo(digits);

        // Smallest and second smallest
        findSmallestTwo(digits);
    }
}
