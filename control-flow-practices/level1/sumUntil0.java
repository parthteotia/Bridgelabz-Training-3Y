import java.util.Scanner;
public class sumUntil0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double b = sc.nextDouble();
        while(true){
            a=a+b;
            b = sc.nextDouble();
            if(b<=0){
                break;
            }
        }
        System.out.println("The sum is "+a);
    }
}

