import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[10];
        int count = 0;
        while(number != 0){
            arr[count] = number % 10;
            number /= 10;
            count++;            
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
