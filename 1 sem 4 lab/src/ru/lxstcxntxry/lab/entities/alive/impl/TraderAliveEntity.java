package ru.lxstcxntxry.lab.entities.alive.impl;

import ru.lxstcxntxry.lab.entities.alive.AliveEntity;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;

public class TraderAliveEntity extends AliveEntity
{
    public TraderAliveEntity(String description) throws InvalidPropertyException
    {
        super(description);
    }

    @Override
    public String toString() {
        return "Продавец " + name;
    }
}
