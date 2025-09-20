import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), div = sc.nextInt();
        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Remainder: " + result[0] + ", Quotient: " + result[1]);
    }
}
