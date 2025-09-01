import java.util.Scanner;
public class AgeHeightCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAmar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int heightAnthony = sc.nextInt();
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest is Amar with age " + ageAmar);
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest is Akbar with age " + ageAkbar);
        } else {
            System.out.println("Youngest is Anthony with age " + ageAnthony);
        }

        // Finding tallest
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest is Amar with height " + heightAmar);
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest is Akbar with height " + heightAkbar);
        } else {
            System.out.println("Tallest is Anthony with height " + heightAnthony);
        }
        
    }
}
