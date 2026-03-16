import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Future Value Calculator\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.println("DATA ENTRY");

            double monthlyInvestment = Console.getDouble(sc,
                    "Enter monthly investment: ", 0, 1000);

            double interestRate = Console.getDouble(sc,
                    "Enter yearly interest rate: ", 0, 30);

            int years = Console.getInt(sc,
                    "Enter number of years: ", 0, 100);

            System.out.println();

            double futureValue = FinancialCalculations.calculateFutureValue(
                    monthlyInvestment, interestRate, years);

            NumberFormat c = NumberFormat.getCurrencyInstance();
            NumberFormat p = NumberFormat.getPercentInstance();
            p.setMinimumFractionDigits(1);

            String results
              = "Monthly investment:   " + c.format(monthlyInvestment) + "\n"
              + "Yearly interest rate: " + p.format(interestRate / 100) + "\n"
              + "Number of years:      " + years + "\n"
              + "Future value:         " + c.format(futureValue) + "\n";

            System.out.println("FORMATTED RESULTS");
            System.out.println(results);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}