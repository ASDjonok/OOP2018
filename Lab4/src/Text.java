public class Text{
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("(?<=[?!.]) ");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentences) {
            result += sentence.toString() + " ";
        }
        return result;
    }

    public String getWordsWithLengthFromQuestions(int wordLength) {
        String result = "";
        for (Sentence sentence : sentences) {
            if (sentence.isQuestion()) {
                result += sentence.getWordsWithLength(wordLength) + "\n";
            }
        }
        return result;
    }
}
