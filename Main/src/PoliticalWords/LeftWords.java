package PoliticalWords;

public enum LeftWords {
    MARKET("Market"),
    MARX("Marx"),
    LGBT("LGBT");

    private final String text;

    LeftWords(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
