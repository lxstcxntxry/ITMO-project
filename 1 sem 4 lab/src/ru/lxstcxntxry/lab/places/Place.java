package ru.lxstcxntxry.lab.places;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.utils.ConsolePrinter;
import ru.lxstcxntxry.lab.utils.Printer;

import java.util.Objects;

public abstract class Place
{
    protected final String title;
    protected final Printer printer;

    protected Place(String title) throws InvalidPropertyException
    {
        if ("".equals(title))
            throw new InvalidPropertyException("#Неправильно указано название места! Оно не может быть пустым.");

        this.title = title;
        printer = new ConsolePrinter();
    }

    public void definePlace()
    {
        printer.printString(title);
    }

    public abstract String getDefiningString();

    @Override
    public int hashCode()
    {
        return Objects.hash(this, title, printer);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(title, place.title) && Objects.equals(printer, place.printer);
    }

    @Override
    public String toString()
    {
        return title;
    }
}
