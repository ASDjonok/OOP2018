public class Proposition {
    private int percent;
    private boolean takeMoneyPossibility;
    private boolean giveMoneyPossibility;

    public int getPercent() {
        return percent;
    }

    public Proposition(int percent,
                       boolean takeMoneyPossibility,
                       boolean giveMoneyPossibility) {
        this.percent = percent;
        this.takeMoneyPossibility = takeMoneyPossibility;
        this.giveMoneyPossibility = giveMoneyPossibility;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + percent;
    }
}
