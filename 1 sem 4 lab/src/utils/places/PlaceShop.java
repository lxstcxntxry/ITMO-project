package utils.places;

import utils.exceptions.EmptyEntityDescriptionException;

public class PlaceShop extends Place{
    public PlaceShop(String description) throws EmptyEntityDescriptionException
    {
        super(description);
    }

    @Override
    public String stringify() {
        return "в" + getDescription();
    }

    @Override
    public String toString() {
        return "Магазин";
    }
}
