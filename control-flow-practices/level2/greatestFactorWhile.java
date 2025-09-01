import java.util.Scanner;

public class greatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int greatest = 1;
        while(i<n){
            if(n%i==0){
                greatest = i;
            }
            i++;
        }
        System.out.println(greatest+" is the greatest factor of "+i+" beside itself.");
    }
}
