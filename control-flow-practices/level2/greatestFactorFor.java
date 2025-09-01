import java.util.Scanner;
public class greatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int greatest = 1;
        for(int i=1;i<n;i++){
            if(n%i==0){
                greatest = i;
            }
        }
        System.out.println(greatest+" is the greatest factor of "+n+" beside itself.");
    }
}
