import java.util.Scanner;
public class DigitsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int count = 0;
        while(number != 0){
                digits[count] = number % 10;
                number /= 10;
                count++;
            }
        for(int i=0;i<digits.length;i++){
        System.out.print(digits[i]+" ");
        }
        int max = 0;
        int secondMax = 0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]>max){
                max = digits[i];
            }
        }
        for(int i=0;i<count;i++){
            if(digits[i] > secondMax && digits[i]<max){
                secondMax = digits[i];
            }
        }
        System.out.println();
        System.out.println("largest: "+max);
        System.out.println("second largest: "+secondMax);
    }
}