import java.text.NumberFormat;
import java.util.Locale;

public class ZaraBonusCalculator {

    private static final int NUM_EMPLOYEES = 10;
    private static final int COMPANY_AGE = 10;

    /**
     * Main method to run the bonus calculation program.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // 1. Determine the initial salary and years of service for each employee.
        int[][] employeeData = determineSalaryAndService();

        // 2. Calculate the new salary and bonus for each employee based on their data.
        double[][] calculatedBonusInfo = calculateNewSalaryAndBonus(employeeData);

        // 3. Display all results in a well-formatted table.
        displayResults(employeeData, calculatedBonusInfo);
    }

    /**
     * Generates a 2D array with random 5-digit salaries and years of service for 10 employees.
     * Salary is between 10,000 and 99,999.
     * Years of service is between 1 and 10 (the age of the company).
     *
     * @return A 2D integer array where [i][0] is the salary and [i][1] is the years of service for employee i.
     */
    public static int[][] determineSalaryAndService() {
        System.out.println("Generating employee salary and service years data...");
        int[][] data = new int[NUM_EMPLOYEES][2];
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            // Generate a random 5-digit salary (10000 to 99999)
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            // Generate random years of service (1 to 10)
            data[i][1] = (int) (Math.random() * COMPANY_AGE) + 1;
        }
        return data;
    }

    /**
     * Calculates the bonus and new salary for each employee.
     * Bonus logic: 5% if service > 5 years, otherwise 2%.
     *
     * @param employeeData The 2D array containing original salaries and years of service.
     * @return A 2D double array where [i][0] is the new salary and [i][1] is the bonus amount for employee i.
     */
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        System.out.println("Calculating bonuses and new salaries...");
        double[][] calculatedData = new double[NUM_EMPLOYEES][2];
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus;

            calculatedData[i][0] = newSalary;
            calculatedData[i][1] = bonus;
        }
        return calculatedData;
    }

    /**
     * Displays the employee data, bonus info, and totals in a formatted table.
     *
     * @param employeeData The original salary and service data.
     * @param calculatedBonusInfo The calculated new salaries and bonus amounts.
     */
    public static void displayResults(int[][] employeeData, double[][] calculatedBonusInfo) {
        // Use NumberFormat for currency formatting to make it look clean.
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("                         ZARA EMPLOYEE BONUS REPORT");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-12s | %-15s | %-15s | %-15s | %-15s%n",
                "Employee #", "Years of Service", "Old Salary", "Bonus Amount", "New Salary");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double newSalary = calculatedBonusInfo[i][0];
            double bonus = calculatedBonusInfo[i][1];

            // Print each employee's details in a formatted row.
            System.out.printf("%-12d | %-15d | %-15s | %-15s | %-15s%n",
                    (i + 1),
                    years,
                    currencyFormatter.format(oldSalary),
                    currencyFormatter.format(bonus),
                    currencyFormatter.format(newSalary));

            // Add to the totals.
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("\n                         COMPANY-WIDE TOTALS");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-30s: %s%n", "Total Old Salary Payout", currencyFormatter.format(totalOldSalary));
        System.out.printf("%-30s: %s%n", "Total Bonus Payout", currencyFormatter.format(totalBonus));
        System.out.printf("%-30s: %s%n", "Total New Salary Payout", currencyFormatter.format(totalNewSalary));
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
