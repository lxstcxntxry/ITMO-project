package ru.lxstcxntxry.lab.entities.alive.impl;

import ru.lxstcxntxry.lab.entities.alive.AliveEntity;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;

public class NeznaykaAliveEntity extends AliveEntity
{
	public NeznaykaAliveEntity(String name) throws InvalidPropertyException
	{
		super(name);
	}

	@Override
	public String toString()
	{
		return "Незнайка ";
	}
}
