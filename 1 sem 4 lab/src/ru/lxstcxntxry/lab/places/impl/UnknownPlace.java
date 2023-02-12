package ru.lxstcxntxry.lab.places.impl;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class UnknownPlace extends Place
{

	public UnknownPlace(String name) throws InvalidPropertyException
	{
		super(name);
	}

	@Override
	public String getDefiningString()
	{
		return "местоположение неизвестно ";
	}

	@Override
	public String toString()
	{
		return "неизвестное место ";
	}
}
