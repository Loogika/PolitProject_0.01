package PoliticalWords;

public enum RightWords {
    EMPEROR("Emperor"),
    EMPIRE("Empire"),
    ALEKSANDR_II("Aleksandr II");

    private final String text;

    RightWords(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
