public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = (int) (cash / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = (milesValue * 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertCash(double cash) {
        return (int) (cash / 0.0035);
    }

    public double convertMiles(int miles) {
        return (miles * 0.0035);
    }
}
