import java.util.Scanner;
public class factorialUsingWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        int i = n;
        while(i>1){
            factorial *= i;
            i--;
        }
        System.out.println("The factorial is "+factorial+".");
    }
}
