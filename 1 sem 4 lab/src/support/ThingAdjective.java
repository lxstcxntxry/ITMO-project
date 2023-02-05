package support;

public enum ThingAdjective {
    FAKE, PLAID, BIG, METAL, CUPRUM, ELECTRIC, BLACK, LATEX;

    @Override
    public String toString() {
        return this.name();
    }
}
