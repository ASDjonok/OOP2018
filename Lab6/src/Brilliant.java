public class Brilliant {
    private int cost;

    public Brilliant(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Brilliant
                && ((Brilliant) obj).cost == cost;
    }

    @Override
    public String toString() {
        return "Brilliant with cost = " + cost;
    }
}
