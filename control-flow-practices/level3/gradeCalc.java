import java.util.Scanner;
public class gradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        float av = (phy+chem+math)/3;

        // percent = av,  assuming max marks in a sub are 100.
        if(av>=80){
            System.out.println("Grade: A \nRemarks: Level 4, Above agency-normalized standards.");
        }
        else if(av>=70 && av<80){
            System.out.println("Grade: B \nRemarks: Level 3, at agency-normalized standards");
        }
        else if(av>=60 && av<70){
            System.out.println("Grade: C \nRemarks: Level 3, Below, but approaching agency-normalized standards");
        }
        else if(av>=50 && av<60){
            System.out.println("Grade: D \nRemarks: Level 3, well below agency-normalized standards");
        }
        else if(av>=40 && av<50){
            System.out.println("Grade: E \nRemarks: Level 3, too below agency-normalized standards");
        }
        else{
            System.out.println("Grade: R \nRemarks: Remedial standards.");
        }

    }
}
