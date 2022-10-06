import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are there?");
        int numPeople = scan.nextInt();

        System.out.println("What's the tip percentage(As a decimal)");
        double tipPercent = scan.nextDouble();

        boolean moreInputs = true;

        while (moreInputs) {
            System.out.print("What is the cost of the item? e.g 12.50 (Type -1 to end): ");

        }

    }
}
