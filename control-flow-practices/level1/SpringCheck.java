import java.util.Scanner;
public class SpringCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        boolean isSpring = (month==3 && date>=20 && date<31 || month==4 && date>0 && date<=30 || month==5 && date>0 && date<=31 || month==6 && date>0 && date<=20);
        if(isSpring){
            System.out.println("Yes! It is spring.");
        }
        else{
            System.out.println("No! It is not spring.");
        }
    }
}
