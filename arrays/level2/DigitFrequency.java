import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        String numStr = String.valueOf(Math.abs(number));
        int len = numStr.length();

        int[] digits = new int[len];
        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int[] freq = new int[10];
        for (int i = 0; i < len; i++) {
            freq[digits[i]]++;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
