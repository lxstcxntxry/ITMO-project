package ru.lxstcxntxry.lab.entities.items.impl;

import ru.lxstcxntxry.lab.entities.items.ItemAdjective;
import ru.lxstcxntxry.lab.entities.items.ItemType;
import ru.lxstcxntxry.lab.entities.items.Item;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class AnyItem extends Item
{
    public AnyItem(String title, String description, Place place) throws InvalidPropertyException
    {
        super(title, description, ItemType.ITEM, place);
    }

    public AnyItem(String title, String description, Place place, ItemAdjective adj) throws InvalidPropertyException
    {
        super(title, description, ItemType.ITEM, place, adj);
    }

    @Override
    public void printItem()
    {
        printer.printString(type + " " + adj + " "  + title + " " + place);
    }

    @Override
    public void printDescription()
    {
        printer.printString("На " + title + " написано: \n--" + description + "--");
    }
}
