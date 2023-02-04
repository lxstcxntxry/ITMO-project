package items;

import support.ThingAdjective;
import support.ThingType;
import utils.entities.Entity;
import utils.exceptions.EmptyEntityDescriptionException;

public class ThingMask extends ThingAbstract {

    public ThingMask(String name) throws EmptyEntityDescriptionException
    {
        super(name, ThingType.MASK);
    }

    public ThingMask(String name, Entity entity){
        super(name, entity, ThingType.MASK);
    }

    public ThingMask(String name, Entity entity, ThingAdjective adj) {
        super(name, entity, adj, ThingType.MASK);
    }

    @Override
    public void printItem() {
        getPrinter().printString(addType(getType()) + addAdjective(getAdj()) + getName() + getPlace().stringify());
    }

    @Override
    public String addAdjective(ThingAdjective adj) {
        if (adj != null) {
            switch (adj) {
                case FAKE -> {
                    return "{Ложный} ";
                }
                case BLACK -> {
                    return "{Черный} ";
                }
            }
        }
        return "";
    }

    @Override
    public String addType(ThingType type) {
        if (type == ThingType.MASK) {
            return "[Маска] ";
        }
        return "";
    }
}
