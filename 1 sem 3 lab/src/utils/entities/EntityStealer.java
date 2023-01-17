package utils.entities;

public class EntityStealer extends Entity {

    public EntityStealer(String description) {
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
