package utils.actions;

public class ActionNeznayka implements Action{
    @Override
    public String perform() {
        return "стоит";
    }

    @Override
    public String toString() {
        return String.format("[строковое представление]: %s", perform());
    }
}
