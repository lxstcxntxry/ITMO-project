package ru.lxstcxntxry.lab.entities.items;

public enum     ItemType
{
    ITEM("[Предмет]"),
    MASK("[Маска]"),
    CLOTHES("[Одежда]"),
    DOOR("[Дверь]");

    private final String desc;
    ItemType(String str) {
        desc = str;
    }

    @Override
    public String toString() {
        return desc;
    }
}