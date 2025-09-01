import java.util.Scanner;
public class whileAddition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double b = sc.nextDouble();
        while(b!=0){
            a=a+b;
            b = sc.nextDouble();
        }
        System.out.println("The sum is "+a);
    }
}
