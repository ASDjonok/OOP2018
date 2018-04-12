public class Sentence extends Object{
    private static String punctuationSymbols = ",.!?;";
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
        SentenceMember currentSentenceMember;
        for (int i = 0; i < sentenceMembers.length; i++) {
            currentSentenceMember = sentenceMembers[i];
            result +=
                    (currentSentenceMember instanceof Word && i != 0 ?
                        " " : "") +
                    sentenceMembers[i].toString();
        }
        return result;
    }

        public static void printClass(SentenceMember sentenceMember) {
        if (sentenceMember instanceof Word) {
            System.out.println("It is Word.");
        } else {
            if (sentenceMember instanceof Punctuation) {
                System.out.println("It is Punctuation.");
            } else {
                System.out.println("It is unknown class.");
            }
        }
    }

    public boolean isQuestion() {
        /*if () {
            return true;
        }
        return false; */
        int indexLastElement = sentenceMembers.length - 1;
        SentenceMember sentenceMember = sentenceMembers[indexLastElement];
        Punctuation punctuation = (Punctuation)sentenceMember;
        boolean result = punctuation.isQuestion();
        return result;
    }

    public String getWordsWithLength(int wordLength) {
        String result = "";

        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word) {
                if (((Word)sentenceMember).getLength() == wordLength){
                    result += sentenceMember.toString() + " ";
                }
            }
        }
        return result;
    }
}
