package ru.lxstcxntxry.lab.actions;

public class AliveEntityAction implements ActionInterface
{
    private final String actionString;

    public AliveEntityAction(String action)
    {
        this.actionString = action;
    }

    @Override
    public String perform()
    {
        return actionString;
    }

    @Override
    public String toString()
    {
        return "[строковое представление]: " + perform();
    }
}
