/*3. The Online Shopping Cart 
A shopping app stores product prices in an array when a customer adds items.
Use a loop to calculate the total cart value.
Apply a discount of 10% if the total exceeds 5000.
Add a delivery charge of 100 if the total after discount is less than 2000.
Display the final payable amount. */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += prices[i];
        }
        System.out.println("Total: "+sum);
        if(sum > 5000){
            sum -= sum/10;
            System.out.println("Discount: 10%");
        }
        if(sum < 2000){
            sum += 100;
            System.out.println("Delivery charges: INR 100");
        }
        System.out.println("Final payable amount: "+sum);
    }
}
