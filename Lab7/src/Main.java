public class Main {
    public static void main(String[] args) {
        Brilliant brilliant = null;
        try {
            brilliant =
                    new Brilliant(0, 1874545);
            new Brilliant(1, 1000);
            new Brilliant(2, 1000);
            new Brilliant(3, 1);
            //...
            new Brilliant(2007568, -1);
            //...
            new Brilliant(4000000, 1);
        } catch (WrongCostException e) {
            System.out.println("Wrong cost. " + e.getMessage());
        }
        //... code with using brilliant
        System.out.println(brilliant);
        /*System.out.println("DOne!");
        String s = null;
        System.out.println(s.toString());*/
    }
}
