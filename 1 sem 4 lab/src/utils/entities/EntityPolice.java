package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityPolice extends Entity {

    public EntityPolice(String description) throws EmptyEntityDescriptionException
    {
        super(description);
    }

    @Override
    public String stringify() {
        return "находится на " + getDescription();
    }

    @Override
    public String toString() {
        return "Полицейский";
    }
}
