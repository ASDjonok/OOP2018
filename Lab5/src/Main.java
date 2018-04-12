public class Main {
    public static void main(String[] args) {
        PropositionSet propositionSet =
                new PropositionSet(3);
        propositionSet.add(
                new PrivateBankProposition(
                        10,
                        false,
                        false));
        propositionSet.add(
                new AlphaBankProposition(
                        10,
                        false,
                        false));
        propositionSet.add(
                new AlphaBankProposition(
                        11,
                        false,
                        false));

        Proposition proposition = propositionSet.findProposition(10);
        System.out.println(proposition);
        System.out.println("Done!");
    }
}
