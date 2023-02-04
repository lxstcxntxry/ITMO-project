package support;

public enum ThingType {
    ITEM("[Предмет]"), MASK("[Маска]"), CLOTHES("[Одежда]");

    private final String desc;
    ThingType(String str) {
        desc = str;
    }

    @Override
    public String toString() {
        return desc;
    }
}