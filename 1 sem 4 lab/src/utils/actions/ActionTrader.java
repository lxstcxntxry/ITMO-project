package utils.actions;

public class ActionTrader implements Action{
    private String action;

    public ActionTrader(String action){
        this.action = action;
    }

    @Override
    public String perform() {
        return getAction();
    }

    @Override
    public String toString() {
        return String.format("[строковое представление]: %s", perform());
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
