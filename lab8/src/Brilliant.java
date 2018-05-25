import java.io.Serializable;

public class Brilliant implements Serializable{
    private int cost;

    public Brilliant(int cost) {
        this.cost = cost;
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
