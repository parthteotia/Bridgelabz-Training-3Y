
import java.util.Scanner;
public class compareNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.println("The number is negetive.");
            }
            else if(arr[i]==0){
                System.out.println("The number is zero.");
            }
            else{
                System.out.print("The number is positive");
                if(arr[i]%2==0){
                    System.out.print(" and The number is even.");
                    System.out.println();
                }
                else{
                    System.out.print(" and The number is odd.");
                    System.out.println();
                }
            }
        }
        if(arr[0]>arr[4]){
                System.out.println("THe first element is greater than the last.");
            }
            else if(arr[0]==arr[4]){
                System.out.println("The first element is equal to the last.");
            }
            else{
                System.out.println("The last element is greater than the first.");
            }
    }
}
