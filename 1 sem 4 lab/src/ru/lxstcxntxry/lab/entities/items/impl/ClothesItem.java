package ru.lxstcxntxry.lab.entities.items.impl;

import ru.lxstcxntxry.lab.entities.items.ItemAdjective;
import ru.lxstcxntxry.lab.entities.items.ItemType;
import ru.lxstcxntxry.lab.entities.items.Item;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class ClothesItem extends Item
{
    public ClothesItem(String title, String description, Place place)
            throws InvalidPropertyException
    {
        super(title, description, ItemType.CLOTHES, place);
    }

    public ClothesItem(String title, String description, Place place, ItemAdjective adj)
            throws InvalidPropertyException
    {
        super(title, description, ItemType.CLOTHES, place, adj);
    }

    @Override
    public void printItem()
    {
        printer.printString(type + " " + adj + " " + title + " " + place);
    }

    @Override
    public void printDescription()
    {
        printer.printString(description.toString());
    }

}
