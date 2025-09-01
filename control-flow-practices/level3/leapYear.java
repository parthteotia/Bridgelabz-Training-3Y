import java.util.Scanner;
public class leapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year<1582 && year%4==0 && year%100!=0 || year<1582 && year%400==0){
            System.out.println("it is a leap year.");
        }
        else if(year>=1582 && year%4!=0){
            System.out.println("it is not a leap year.");
        }
        else{
            System.out.println("enter a year greater than 1582.");
        }
    }
}