import java.util.Scanner;
public class meanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 11;
        double[] heights = new double[size];
        for(int i=0;i<size;i++){
            heights[i] = sc.nextInt();
        }
        double sum = 0;
        for(int i=0;i<size;i++){
            sum += heights[i];
        }
        double mean = sum/11;
        System.out.println(mean);
    }
}
