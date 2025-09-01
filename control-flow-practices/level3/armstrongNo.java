import java.util.Scanner;
public class armstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfCubes = 0;
        int originalNo = n;

        while(originalNo != 0){
            int x = (originalNo%10);
            sumOfCubes += x*x*x;
            originalNo /= 10;
        }
        if(sumOfCubes==n){
            System.out.println(n+" is an armstrong number.");
        }
        else{
            System.out.println(n+" is not an armstrong number.");
        }
    }
}
