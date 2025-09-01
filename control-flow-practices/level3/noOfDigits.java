import java.util.Scanner;
public class noOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        if(n==0){
            count = 1;
        }
        while(temp!=0){
            temp /= 10;
            count++;
        }
        System.out.println(count);
    }  
}
