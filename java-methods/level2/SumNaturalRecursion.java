import java.util.Scanner;

public class SumNaturalRecursion {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumForm = formulaSum(n);

        System.out.println("Recursive Sum = " + sumRec);
        System.out.println("Formula Sum = " + sumForm);
        System.out.println("Both are equal: " + (sumRec == sumForm));
    }
}
