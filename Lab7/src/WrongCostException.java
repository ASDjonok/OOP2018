public class WrongCostException extends Exception{
    public WrongCostException(int id, int cost) {
        super("Cost = " + cost + ", id = " + id);
    }
}
