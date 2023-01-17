package utils.entities;

public class EntityWindow extends Entity {

    public EntityWindow(String description){
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
