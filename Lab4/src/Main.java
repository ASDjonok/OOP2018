public class Main {
    public static void main(String[] args) {
        String s = "Hello, World! How are you?";
        Text text = new Text(s);
        System.out.println(text/*.toString()*/);
        System.out.println("The End.");

        System.out.println("\nP.S.:");
        Sentence.printClass(new Punctuation("."));
        Sentence.printClass(new Word("Hello"));

//        text.doMyVariant();
        /*String s2 = "Hello, World! How are you?";
        s = s + "1";
        System.out.println(s == s2);

        StringBuffer stringBuffer = new StringBuffer("123");
        String s3 = "123";

        System.out.println(s3.equals(stringBuffer.toString()));
        System.out.println(s3 == stringBuffer.toString());

        Punctuation punctuation = new Punctuation('.');
        Punctuation punctuation2 = new Punctuation('.');
        System.out.println(punctuation.getSymbols().equals(
                punctuation2.getSymbols())
        );*/
    }
}
