public class Proposition implements Comparable<Proposition>{
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

    @Override
    public int compareTo(Proposition o) {
//        return percent - o.percent;
//        return Integer.MIN_VALUE - 2;
//        "AA".compareTo("AB");
        if (percent < o.percent) {
            return -1;
        }
        if (percent > o.percent) {
            return 1;
        }
        return 0;
    }
}
