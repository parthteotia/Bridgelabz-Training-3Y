import java.util.Scanner;
public class bmi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double w = sc.nextInt();
        h = h/100;
        double bmi = w/(h*h);
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>18.4 && bmi<25.0){
            System.out.println("Normal");
        }
        else if(bmi>=25.0 && bmi<40.0){
            System.out.println("Overweight");
        }
        else if(bmi>=40.0){
            System.out.println("Obese");
        }
    }
}