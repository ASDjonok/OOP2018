import java.io.Serializable;

public class Brilliant implements Serializable{
//    final long serialVersionUID = -5161207827521945616L;
    private int cost;
    private int weight;

    public Brilliant(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    //todo override hashCode()
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Brilliant
                && ((Brilliant) obj).cost == cost;
    }

    @Override
    public String toString() {
        return "list.Brilliant with cost = " + cost + " weight = " + weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }
}
