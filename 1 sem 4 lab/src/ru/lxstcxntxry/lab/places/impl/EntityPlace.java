package ru.lxstcxntxry.lab.places.impl;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class EntityPlace extends Place
{


	public EntityPlace(String title) throws InvalidPropertyException
	{
		super(title);
	}

	@Override
	public String getDefiningString()
	{
		return "находится на " + title;
	}

	@Override
	public String toString()
	{
		return "место: " + title;
	}
}
