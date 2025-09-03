/*1. The Library Book Tracker 
A library records the number of books borrowed each day for 7 days in an array.
Use a loop to calculate the total number of books borrowed in the week.
Find the day with the highest borrowings.
Check if there was any day with zero borrowings (holiday).
Display the average daily borrowings.
 */
import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[7];
        for(int i=0;i<books.length;i++){
            books[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<books.length;i++){
            sum += books[i];
        }
        System.out.println("The total number of books borrowed in the week are "+sum+".");
        int max = 0;
        for(int i=1;i<books.length;i++){
            if(books[i]>books[i-1]){
                max = i;
            }
        }
        switch(max){
                case 0: System.out.println("Sunday is the day with the highest borrowings.");
                break;
                case 1: System.out.println("Monday is the day with the highest borrowings.");
                break;
                case 2: System.out.println("Tuesday is the day with the highest borrowings.");
                break;
                case 3: System.out.println("Wednesday is the day with the highest borrowings.");
                break;
                case 4: System.out.println("Thursday is the day with the highest borrowings.");
                break;
                case 5: System.out.println("Friday is the day with the highest borrowings.");
                break;
                case 6: System.out.println("Saturday is the day with the highest borrowings.");
                break;
                default: System.out.println("Invalid");
                }
        for(int i=0;i<books.length;i++){
            if(books[i]==0){
                switch(i){
                case 0: System.out.println("Sunday is the day with zero borrowings.");
                break;
                case 1: System.out.println("Monday is the day with zero borrowings.");
                break;
                case 2: System.out.println("Tuesday is the day with zero borrowings.");
                break;
                case 3: System.out.println("Wednesday is the day with zero borrowings.");
                break;
                case 4: System.out.println("Thursday is the day with zero borrowings.");
                break;
                case 5: System.out.println("Friday is the day with zero borrowings.");
                break;
                case 6: System.out.println("Saturday is the day with zero borrowings.");
                break;
                default: System.out.println("Invalid");
                }
            }
        }
        int av = sum/7;
        System.out.println("The average dauly borrowing is "+av+".");
    }
}