public class NumberChcker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is Neon
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is Spy
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is Automorphic
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    // Method to check if a number is Buzz
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // Main method to test
    public static void main(String[] args) {
        int num = 7; // Example number

        System.out.println("Number: " + num);
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));
    }
}
