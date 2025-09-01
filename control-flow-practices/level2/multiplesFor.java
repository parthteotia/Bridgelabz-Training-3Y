import java.util.Scanner;
public class multiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The multiples of "+n+" are: ");
        System.out.println(0);
        for(int i=n;i<100;i++){
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
}
