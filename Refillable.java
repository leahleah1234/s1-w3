public class Refillable {
    private int amount;
    private int totalUse;
    private int totalTimesUsedHappened;

    public Refillable() {
        amount = 10;
    }

    public Refillable(int amt) {
        amount = amt;
    }

    public void increase(int a) {
        amount += a;
    }

    public void decrease(int a) {
        amount -= a;
    }

    public double averageUse() {
        return totalUse * 1.0/ totalTimesUsedHappened;
    }

    public int getAmount() {
        return amount;
    }
}
