package utils.entities;

public class EntityDwarf extends Entity{

    public EntityDwarf(String description) {
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
