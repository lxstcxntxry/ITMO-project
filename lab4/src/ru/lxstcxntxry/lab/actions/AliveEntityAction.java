package ru.lxstcxntxry.lab.actions;

public class AliveEntityAction implements Action
{
    private final String actionString;

    public AliveEntityAction(String action)
    {
        actionString = action;
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
