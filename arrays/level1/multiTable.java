import java.util.Scanner;
public class multiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[4];
        int j = 6;
        for(int i=0;i<=3;i++){
            arr[i] = n*j;
            System.out.println(n+" "+"X"+" "+j+" "+"="+" "+n*j);
            j++;
        }
    }
}
