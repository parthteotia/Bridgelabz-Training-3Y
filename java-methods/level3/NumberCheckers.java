import java.util.Arrays;

public class NumberCheckers {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] rev = reverseArray(digits);
        return arraysEqual(digits, rev);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true; // contains a zero
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        int num = 1221; // Example number

        System.out.println("Number: " + num);

        // Digits
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Count of digits
        System.out.println("Count of digits: " + countDigits(num));

        // Reverse digits
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));

        // Compare arrays
        System.out.println("Arrays Equal? " + arraysEqual(digits, reversed));

        // Palindrome check
        System.out.println("Is Palindrome? " + isPalindrome(digits));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
