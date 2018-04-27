import java.util.Arrays;
import java.util.Collections;

public class PropositionSet {
    private Proposition[] propositions;
    private int size;

    public void sort() {
        Arrays.sort(propositions, Collections.<Proposition>reverseOrder());
    }

    @Override
    public String toString() {
        return Arrays.toString(propositions);
    }

    public PropositionSet(int size) {
        propositions = new Proposition[size];
        size = 0;
    }

    public Proposition findProposition(int percent){
        Proposition result = null;

        for (Proposition proposition : propositions) {
            if (proposition.getPercent() == percent) {
                result = proposition;
                break;
            }
        }

        return result;
    }

    public Proposition[] findPropositions(int percent){
        Proposition[] results =
                new Proposition[propositions.length];
        int counter = 0;

        for (Proposition proposition : propositions) {
            if (proposition.getPercent() == percent) {
                results[counter++] = proposition;
            }
        }

        Proposition[] newResults =
                new Proposition[counter];

        System.arraycopy(results, 0, newResults, 0, counter);

        return newResults;
    }

    public void add(Proposition proposition) {
        if (size < propositions.length) {
            propositions[size++] = proposition;
        }
    }
}
