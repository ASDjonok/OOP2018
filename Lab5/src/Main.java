public class Main {
    public static void main(String[] args) {
        PropositionSet propositionSet =
                new PropositionSet(3);
        propositionSet.add(
                new PrivateBankProposition(
                        12,
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

        /*Proposition proposition = propositionSet.findProposition(10);
        System.out.println(proposition);*/
        System.out.println(propositionSet);
        propositionSet.sort();
        System.out.println(propositionSet);

        int[] ma = {1,5,7,3,4,5,6,7,8};

        System.out.println("Done!");
        /*System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 2);*/
    }
}
