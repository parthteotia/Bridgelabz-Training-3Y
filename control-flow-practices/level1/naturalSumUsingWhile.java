import java.util.Scanner;
public class naturalSumUsingWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        if(n<0){
            System.out.println("Invalid input!");
        }
        else{
            while(i<=n){
            sum = sum+i;
            i++;
            }
            System.out.println("The sum of "+n+" natural no.s is "+sum+".");
        }
        int sum2 = n*(n+1)/2;
        if(sum == sum2){
            System.out.println("The formula is correct.");
        }
        else{
            System.out.println("The formula is incorrect.");
        }
    }
}
