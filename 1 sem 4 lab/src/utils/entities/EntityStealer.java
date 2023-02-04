package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityStealer extends Entity {

    public EntityStealer(String description) throws EmptyEntityDescriptionException
    {
        super(description);
    }

    @Override
    public String stringify() {
        return "находится на " + getDescription();
    }

    @Override
    public String toString() {
        return "Грабитель";
    }
}
