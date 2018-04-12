public class Main {
    public static void main(String[] args) {
        String s = "Hello, World! How4 are you?";
        Text text = new Text(s);
        final int wordLength = 3;
        System.out.println(text);
        System.out.println("Words with length:\n" + text.getWordsWithLengthFromQuestions(wordLength));
        System.out.println("The End.");

    }
}
