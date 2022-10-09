// Import of Classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.00");

        // Welcoming message
        System.out.println("Welcome to the tip calculator!");

        // asking for user input
        System.out.print("How many people are there?");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage");
        int tip = scan.nextInt();

        // New Tip Calculator Object
        TipCalculator calc = new TipCalculator(people, tip);

        System.out.print("Enter the cost of the item in dollar and cents (Type -1 to end): ");
        double cost = scan.nextDouble();

        // While loop to enable cost input until -1 is inputted.
        while (cost != -1) {
            calc.getMeal(cost);
            System.out.print("Enter the cost of the item in dollar and cents (Type -1 to end): ");
            cost = scan.nextDouble();
        }

        // Bill Calculations and formatting to two decimal places.
        String formattedTotalCost = formatter.format(calc.getTotalBillBeforeTip());
        String formattedTip = formatter.format(calc.getTipPercent());
        String formattedTotalTip = formatter.format(calc.tipAmount());
        String formattedBillWithTip = formatter.format(calc.totalBill());
        String formattedCostPerPerson = formatter.format(calc.costPerPersonBeforeTip());
        String formattedTipPerPerson = formatter.format(calc.tipAmountPerPerson());
        String formattedTotalPerPerson = formatter.format(calc.totalCostPerPerson());

        // Printing out all the formatted info.
        System.out.println("--------------------");
        System.out.println("Total Bill Before Tip: " + formattedTotalCost);
        System.out.println("Tip Percent: " + formattedTip);
        System.out.println("Total Tip Amount: " + formattedTotalTip);
        System.out.println("Total Bill Including Tip: " + formattedBillWithTip);
        System.out.println("Cost Per Person Before Tip: " + formattedCostPerPerson);
        System.out.println("Tip Per Person: " + formattedTipPerPerson);
        System.out.println("Final Amount Per Person: " + formattedTotalPerPerson);
    }
}
