package ru.lxstcxntxry.lab.entities.alive.impl;

import ru.lxstcxntxry.lab.entities.alive.AliveEntity;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;

public class StealerAliveEntity extends AliveEntity
{
    public StealerAliveEntity(String name) throws InvalidPropertyException
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return "Грабитель " + name;
    }
}
