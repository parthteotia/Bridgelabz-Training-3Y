import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;
            data[i][2] = weight / (heightM * heightM);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        calculateBMI(personData);

        for (int i = 0; i < 10; i++) {
            status[i] = getStatus(personData[i][2]);
            System.out.println("Person " + (i+1) + 
                " -> Weight: " + personData[i][0] + 
                ", Height: " + personData[i][1] + 
                ", BMI: " + personData[i][2] + 
                ", Status: " + status[i]);
        }
    }
}
