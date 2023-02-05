package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityTrader extends Entity{

    public EntityTrader(String description) throws EmptyEntityDescriptionException
    {
        super(description);
    }

    @Override
    public String stringify() {
        return getDescription();
    }

    @Override
    public String toString() {
        return "Продавец";
    }
}
