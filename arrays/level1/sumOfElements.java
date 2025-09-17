import java.util.Scanner;
public class sumOfElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for(int i=0;i<=9;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
        }
        for(int i=0;i<=9;i++){
            sum += arr[i];
        }
        for(int i=0;i<=9;i++){
            System.out.println(arr[i]);
            if(arr[i]==0){
                break;
            }
        }
        System.out.println("The sum of all elements in the array is "+sum+".");
    }
}
