package items;

import support.ThingAdjective;
import support.ThingType;
import utils.entities.Entity;
import utils.exceptions.EmptyEntityDescriptionException;

public class ThingItem extends ThingAbstract {

    public ThingItem(String name) throws EmptyEntityDescriptionException
    {
        super(name, ThingType.ITEM);
    }

    public ThingItem(String name, Entity entity){
        super(name, entity, ThingType.ITEM);
    }

    public ThingItem(String name, Entity entity, ThingAdjective adj) {
        super(name, entity, adj, ThingType.ITEM);
    }

    @Override
    public void printItem() {
        getPrinter().printString(addType(getType()) + addAdjective(getAdj())
                + getName() + getPlace().stringify());
    }

    @Override
    public String addAdjective(ThingAdjective adj) {
        if (adj != null) {
            switch (adj) {
                case FAKE -> {
                    return "{Ложный} ";
                }
                case BIG -> {
                    return "{Большой} ";
                }
                case CUPRUM -> {
                    return "{Медный} ";
                }
                case ELECTRIC -> {
                    return "{Электрический} ";
                }
            }
        }
        return "";
    }

    @Override
    public String addType(ThingType type) {
        if (type == ThingType.ITEM) {
            return "[Предмет] ";
        }
        return "";
    }
}
