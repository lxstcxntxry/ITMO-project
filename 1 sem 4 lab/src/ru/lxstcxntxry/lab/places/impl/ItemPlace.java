package ru.lxstcxntxry.lab.places.impl;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class ItemPlace extends Place
{
	public ItemPlace(String title) throws InvalidPropertyException
	{
		super(title);
	}

	@Override
	public String getDefiningString()
	{
		return "в " + title;
	}

	@Override
	public String toString()
	{
		return "место: находился в предмете под названием: " + title;
	}
}
