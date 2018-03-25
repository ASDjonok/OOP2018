public class Text {
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("(?<=[?!.])");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }
}
