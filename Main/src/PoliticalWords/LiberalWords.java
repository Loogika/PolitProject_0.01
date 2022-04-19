package PoliticalWords;

public enum LiberalWords {
    SVETOV("Svetov"),
    KAZ("Kaz"),
    SOBCHAK("Sobchak"),
    DUGIN("DUGIN"),
    LINK("LINK"),
    MICHAIL("MICHAIL"),
    PUCHKOV("PUCHKOV"),
    PONASENKOV("PONASENKOV"),
    IGOR("IGOR"),
    ALEKSANDER("ALEKSANDER"),
    NAVALNY("Navalny");

    private final String text;

    LiberalWords(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
