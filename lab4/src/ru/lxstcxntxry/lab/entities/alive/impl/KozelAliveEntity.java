package ru.lxstcxntxry.lab.entities.alive.impl;

import ru.lxstcxntxry.lab.entities.alive.AliveEntity;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;

public class KozelAliveEntity extends AliveEntity
{
	public KozelAliveEntity(String name) throws InvalidPropertyException
	{
		super(name);
	}

	@Override
	public String toString()
	{
		return "Козёл по кличке " + name;
	}
}
