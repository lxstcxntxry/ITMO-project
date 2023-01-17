package items;

import support.ThingAdjective;
import support.ThingType;
import utils.entities.Entity;

public class ThingClothes extends ThingAbstract {

    public ThingClothes(String name){
        super(name, ThingType.CLOTHES);
    }

    public ThingClothes(String name, Entity entity){
        super(name, entity, ThingType.CLOTHES);
    }

    public ThingClothes(String name, Entity entity, ThingAdjective adj) {
        super(name, entity, adj, ThingType.CLOTHES);
    }

    @Override
    public void printItem() {
        getPrinter().printString(addType(getType()) + addAdjective(getAdj()) + getName() + getPlace().stringify());
    }

    @Override
    public String addAdjective(ThingAdjective adj) {
        if (adj != null) {
            switch (adj) {
                case BLACK -> {
                    return "{Черный} ";
                }
                case PLAID -> {
                    return "{Клетчатый} ";
                }
            }
        }
        return "";
    }

    @Override
    public String addType(ThingType type) {
        if (type == ThingType.CLOTHES) {
            return "[Одежда] ";
        }
        return "";
    }
}
