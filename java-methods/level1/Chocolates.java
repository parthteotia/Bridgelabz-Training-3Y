import java.util.Scanner;

public class Chocolates {
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choco = sc.nextInt(), kids = sc.nextInt();
        int[] result = distributeChocolates(choco, kids);
        System.out.println("Each child gets: " + result[1] + ", Remaining: " + result[0]);
    }
}
