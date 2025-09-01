//number divisible by the sum of its digits.

import java.util.Scanner;
public class harshadNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitSum = 0;
        int temp = n;
        while(temp != 0){
            int x = temp%10;
            digitSum += x;
            temp /= 10;
        }
        if(temp%digitSum == 0){
            System.out.println(n+" is a Harshad number.");
        }
        else{
            System.out.println(n+" is not a Harshad number.");
        }
    }    
}
