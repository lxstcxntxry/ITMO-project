package ru.lxstcxntxry.lab.entities.items;

public enum ItemAdjective
{
    DEFAULT("{Обычный}"),
    FAKE("{Ложный}"),
    PLAID("{Клетчатый}"),
    BIG("{Большой}"),
    METAL("{Металлический}"),
    CUPRUM("{Медный}"),
    ELECTRIC("{Электрический}"),
    BLACK("{Черный}"),
    LATEX("{Резиновый}");

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
