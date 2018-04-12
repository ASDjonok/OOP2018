public class Punctuation extends SentenceMember{
    private String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    public Punctuation(char symbol) {
        symbols = "" + symbol;
    }

    public String getSymbols() {
        return symbols;
    }

    public String toString() {
        return symbols;
    }

    public boolean isQuestion() {
//        return '?' == symbols.charAt(0);
        return symbols.contains("?");
    }
}
