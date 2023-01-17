package utils.actions;

public class ActionStealer implements Action{
    @Override
    public String perform() {
        return "подкрадывается";
    }

    @Override
    public String toString() {
        return "[строковое представление]: " + perform();
    }
}
