import java.util.Scanner;

public class powerOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int result = 1;
        if(pow>=0){
            for(int i=1;i<=pow;i++){
            result*=n;
        }
        System.out.println(result);
        }
        else{
            System.out.println("invalid input");
        }
    }
}
