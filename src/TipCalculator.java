public class TipCalculator {

    private int numPeople;
    private double tipPercent;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercent) {
        this.numPeople = numPeople;
        this.tipPercent = tipPercent;
        this.totalBillBeforeTip = 0.0;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public void getMeal(double cost) {
         totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return (totalBillBeforeTip / tipPercent);
    }
}

