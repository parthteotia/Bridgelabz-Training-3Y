import java.util.Scanner;
public class ZaraBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totBonus = 0, totOldSalary = 0, totNewSalary = 0;
        Double[][] empData = new Double[10][2];  
    //empData[i][0] - salary of employee i ; empData[i][1] - years of employee i
        for(int i=0;i<10;i++){
            System.out.println("Enter details of employees");
            //salary
            while(true){
                if(sc.hasNextDouble()){
                    empData[i][0] = sc.nextDouble();
                    if(empData[i][0] > 0) break;
                }else sc.next();
                System.out.println("enter valid salary.");
            }
            //years of service
            while(true){
                if(sc.hasNextDouble()){
                    empData[i][1] = sc.nextDouble();
                    if(empData[i][1] > 0) break;
                }else sc.next();
                System.out.println("enter valid years.");
            }
        }
        double[][] result = new double[10][2];   
    //result[i][0] - bonus of i ; //result[i][1] - new salary of i
        for(int i=0;i<10;i++){
            double salary = empData[i][0];
            double years = empData[i][0];

            if(years > 5){
                result[i][0] = salary*0.05;  //bonus
            }else{
                result[i][0] = salary*0.02;
            }
            result[i][1] = salary + result[i][0];

            totBonus += result[i][0];
            totOldSalary += salary;
            totNewSalary += result[i][1];
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), empData[i][0], result[i][0], result[i][1]);
        }

        System.out.println("\nTotal Old Salary: " + totOldSalary);
        System.out.println("Total Bonus Payout: " + totBonus);
        System.out.println("Total New Salary: " + totNewSalary);

        sc.close();
    }
}