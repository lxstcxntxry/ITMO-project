package utils.entities;

public class EntityPolice extends Entity {

    public EntityPolice(String description) {
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
