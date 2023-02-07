package ru.lxstcxntxry.lab.entities.items;

public enum ItemAdjective
{
    DEFAULT(""),
    FAKE(""),
    PLAID(""),
    BIG(""),
    METAL(""),
    CUPRUM(""),
    ELECTRIC(""),
    BLACK(""),
    LATEX("");

    private final String description;
    ItemAdjective(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return description;
    }
}
