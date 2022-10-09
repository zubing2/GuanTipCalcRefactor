public class TipCalculator {

    // declaring the instance variables
    private int numPeople;
    private double tipPercent;
    private double totalBillBeforeTip;

    // main constructor
    public TipCalculator(int numPeople, double tipPercent) {
        this.numPeople = numPeople;
        this.tipPercent = tipPercent;
        this.totalBillBeforeTip = 0.0;
    }

    // getter methods
    public double getTipPercent() {
        return tipPercent;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    // adds the cost of each item to the total price
    public void getMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    // returns the amount that is being tipped in decimal form
    public double tipAmount() {
        return (totalBillBeforeTip * (tipPercent / 100.00));
    }

    // returns total bill amount including tip
    public double totalBill() {
        return (totalBillBeforeTip + tipAmount());
    }

    // returns the cost per person before tip
    public double costPerPersonBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    // returns the amount of tip each person pays
    public double tipAmountPerPerson() {
        return tipAmount() / numPeople;
    }

    // returns the final cost per person with tip
    public double totalCostPerPerson() {
        return totalBill() / numPeople;
    }
}

