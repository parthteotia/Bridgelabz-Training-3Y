import java.util.Scanner;
public class factorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fac = new int[n];
        int j = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fac[j] = i;
                j++;
            }
        }
        for(int i=0;i<j;i++){
            if(fac[i]!=0){
                System.out.println(fac[i]);
            }
            else{
                continue;
            }
        }
    }    
}
