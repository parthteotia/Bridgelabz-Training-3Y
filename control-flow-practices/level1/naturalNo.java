import java.util.Scanner;
public class naturalNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        if(num>0){
            System.out.println("Yes, it is a natural number.");
        }
        else{
            System.out.println("No, not a natural number.");
        }
        int sum = n*(n+1)/2;
        System.out.println("The sum of "+n+" natural numbers is "+sum+".");
    }
}
