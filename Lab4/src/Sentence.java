public class Sentence extends Object{
    private static String punctuationSymbols = ",.!?;";
    /*private Word[] words;
    private Punctuation[] punctuations;*/

    private SentenceMember[] sentenceMembers;

    public Sentence(String s) {
        String[] split = s.split("(?=,|\\.|!|\\?)|\\s");
//        System.out.println(Arrays.toString(split));
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (punctuationSymbols.contains(split[i])) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
            }
        }
    }

    public String toString() {
        String result = "";
        for (SentenceMember sentenceMember : sentenceMembers) {
            result += sentenceMember.toString();
        }
        return result;
    }
}
