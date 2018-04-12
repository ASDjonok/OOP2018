public class Word extends SentenceMember{
    private Letter[] letters;

    public Word(String s) {
        char[] chars = s.toCharArray();
        letters = new Letter[s.length()];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }
    }

    public String toString() {
        String result = "";
        for (Letter letter : letters) {
            result += letter.toString();
        }
        return result;
    }

    public int getLength() {
        return letters.length;
    }
}
