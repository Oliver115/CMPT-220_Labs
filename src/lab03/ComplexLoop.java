// CMPT220
// Oliver Wilson

package lab03;
import java.util.Scanner;

public class ComplexLoop {
    /**
     * main method that calculates the return investment based on 'annual percentage' and 'number of months.'
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial investment deposit: $"); // User enters initial investment money
        double userInitialDeposit = input.nextDouble();
        double returnMoney = userInitialDeposit;

        System.out.print("Enter Annual percentage: %"); // User enters annual percentage yield
        double annualPercentage = input.nextDouble();

        System.out.print("Enter number of months: "); // User enters amount of months
        int maturity = input.nextInt();

        // Calculate the return investment
        for (int count = 1; count <= maturity; count++) {
            double returnInvestment = (userInitialDeposit
                    *(annualPercentage / 1000));
            returnMoney += returnInvestment; // Add the amount to the current investment

        }
        // Print the return investment after x months
        System.out.println("\nYour return investment for $" + (float)(userInitialDeposit) +
                " in " + (int)(maturity) + " months\nwith a annual percentage yield of "
                + annualPercentage + "% will be: $" + (float)(returnMoney));
    }
}