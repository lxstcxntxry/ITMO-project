package ru.lxstcxntxry.lab.places.impl;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class ShopPlace extends Place
{
    public ShopPlace(String title) throws InvalidPropertyException
    {
        super(title);
    }

    @Override
    public String getDefiningString()
    {
        return "находится в" + title;
    }

    @Override
    public String toString()
    {
        return "Место: " + title;
    }
}
