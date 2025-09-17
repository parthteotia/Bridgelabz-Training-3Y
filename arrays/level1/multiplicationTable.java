
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = n*(i+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(n+" "+"X"+" "+(i+1)+" "+"="+" "+arr[i]);
        }
    }
}
