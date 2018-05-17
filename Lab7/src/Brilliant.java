public class Brilliant {
    private int id;
    private int cost;

    public Brilliant(int id, int cost) throws WrongCostException {
        if (cost < 0) {
//            this.cost = 0;
//            System.out.println("No brilliant!");
            throw new WrongCostException(id, cost);
        } else {
            this.cost = cost;
        }
    }

    //todo override hashCode()
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Brilliant
                && ((Brilliant) obj).cost == cost;
    }

    @Override
    public String toString() {
        return "list.Brilliant with cost = " + cost;
    }
}
