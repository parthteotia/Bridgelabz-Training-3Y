import java.util.Scanner;
public class calculatorUsingSwith{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String op = sc.next();
        switch (op){
            case "+":
            System.out.println(num1+num2);
            break;
            case "-":
            System.out.println(num1-num2);
            break;
            case "*":
            System.out.println(num1*num2);
            break;
            case "/":
            System.out.println(num1/num2);
            break;
            default:
            System.out.println("invalid operator");
        }
    }
}