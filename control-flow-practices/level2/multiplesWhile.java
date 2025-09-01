import java.util.Scanner;

public class multiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        System.out.println("The multiples of "+n+" are: ");
        System.out.println(0);
        while(i<100){
            if(i%n==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
