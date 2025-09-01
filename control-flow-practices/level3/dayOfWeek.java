import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month, day, and year in a single line separated by spaces
        System.out.print("Enter month, day, year (separated by spaces): ");
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        // Zeller's Congruence formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        // Print result
        System.out.println("Day of week (0=Sunday, 1=Monday, ..., 6=Saturday): " + d0);

        sc.close();
    }
}
