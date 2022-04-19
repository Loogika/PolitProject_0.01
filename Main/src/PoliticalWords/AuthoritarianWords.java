package PoliticalWords;

public enum AuthoritarianWords {
    GULAG("Gulag"),
    PLANNED_ECONOMY("Planned Economy"),
    CENSORSHIP("Censorship");

    private final String text;

    AuthoritarianWords(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
