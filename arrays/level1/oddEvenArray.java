import java.util.Scanner;
public class oddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int eveSize = n/2;
        int oddSize = (n+1)/2;
        int j = 0;
        int l = 0;
        int[] odd = new int[oddSize];
        int[] eve = new int[eveSize];
        
        for(int i=1;i<=n;i++){
            if(i%2==0){
                eve[j] = i;
                j++;
            }
            else{
                odd[l] = i;
                l++;
            }
        }
        for(int i=0;i<oddSize;i++){
            System.out.print(odd[i]+" ");
        }
        System.out.println();
        for(int i=0;i<eveSize;i++){
            System.out.print(eve[i]+" ");
        }
    }
}
