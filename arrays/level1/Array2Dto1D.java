import java.util.Scanner;
public class Array2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int k = 0;
        int[][] arr = new int[rows][cols];
        int[] arr1D = new int[rows*cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1D[k++] = arr[i][j];
            }
        }
        for(int i=0;i<rows*cols;i++){
            System.out.print(arr1D[i]+" ");
        }
    }
}
