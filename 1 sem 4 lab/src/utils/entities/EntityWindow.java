package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityWindow extends Entity {

    public EntityWindow(String description) throws EmptyEntityDescriptionException
    {
        super(description);
    }

    @Override
    public String stringify() {
        return "находится в " + getDescription();
    }

    @Override
    public String toString() {
        return "Витрина";
    }
}
