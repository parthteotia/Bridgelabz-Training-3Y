import java.util.Arrays;

public class NumbersChecker {

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

    // Method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is a Harshad number
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // Main method to test everything
    public static void main(String[] args) {
        int num = 1729; // Example number

        System.out.println("Number: " + num);

        // Digits
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Count of digits
        System.out.println("Count of digits: " + countDigits(num));

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares of digits
        System.out.println("Sum of squares: " + sumOfSquares(digits));

        // Harshad check
        System.out.println("Is Harshad Number? " + isHarshad(num, digits));

        // Frequency
        System.out.println("Digit Frequencies:");
        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " → " + freq[i][1] + " times");
            }
        }
    }
}
