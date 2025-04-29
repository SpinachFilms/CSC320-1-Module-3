import java.util.Scanner;

public class TaxWithholdingCalculator {
    public static void main(String[] args) {
        // Declare variables
        double income;
        double taxRate;
        double withholding;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for income
        System.out.print("Enter your weekly income: ");
        income = input.nextDouble();

        // Determine tax rate based on income
        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculate withholding
        withholding = income * taxRate;

        // Display the result
        System.out.printf("Your weekly tax withholding is: $%.2f\n", withholding);

        // Close the Scanner
        input.close();
    }
}