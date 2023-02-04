package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityDwarf extends Entity{

    public EntityDwarf(String description) throws EmptyEntityDescriptionException
    {
        super(description);
    }

    @Override
    public String stringify() {
        return getDescription();
    }

    @Override
    public String toString() {
        return "Коротышка";
    }
}
