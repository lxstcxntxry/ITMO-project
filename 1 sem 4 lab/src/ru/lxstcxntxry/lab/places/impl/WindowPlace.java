package ru.lxstcxntxry.lab.places.impl;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class WindowPlace extends Place
{
	public WindowPlace(String title) throws InvalidPropertyException
	{
		super(title);
	}

	@Override
	public String getDefiningString()
	{
		return "находится в " + title;
	}

	@Override
	public String toString()
	{
		return "место: " + title;
	}
}
