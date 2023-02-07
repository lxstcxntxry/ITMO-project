package ru.lxstcxntxry.lab.entities.items;

import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;
import ru.lxstcxntxry.lab.utils.ConsolePrinter;
import ru.lxstcxntxry.lab.utils.Printer;

import java.util.Objects;


public abstract class Item
{
    protected final String title;
    protected final ThingDescription description;
    protected final ItemType type;
    protected final ItemAdjective adj;
    protected Place place;
    protected final Printer printer;

    public class ThingDescription
    {
        private final String description;

        public ThingDescription(String description)
        {
            this.description = description;
        }

        @Override
        public String toString()
        {
            return description;
        }

    }

    public Item(String title, String description, ItemType type, Place place) throws InvalidPropertyException
    {
        if ("".equals(title))
            throw new InvalidPropertyException("Название вещи не может быть пустым!");

        this.title = title;
        this.description = new ThingDescription(description);
        this.type = type;
        adj = ItemAdjective.DEFAULT;
        this.place = place;
        printer = new ConsolePrinter();
    }

    public Item(String title, String description, ItemType type, Place place, ItemAdjective adj)
            throws InvalidPropertyException
    {
        if ("".equals(title))
            throw new InvalidPropertyException("Название вещи не может быть пустым!");

        this.title = title;
        this.description = new ThingDescription(description);
        this.type = type;
        this.adj = adj;
        this.place = place;
        printer = new ConsolePrinter();
    }

    public String getTitle()
    {
        return title;
    }

    public ItemType getType()
    {
        return type;
    }

    public ThingDescription getDescription()
    {
        return description;
    }

    public abstract void printItem();
    public abstract void printDescription();

    public void looksLike(Item thg)
    {
        if(thg != null)
            printer.printString(title + " " + type + "похожа на " + thg.title + " " + thg.getType());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this, title, description, type, adj, place);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item that = (Item) o;
        return Objects.equals(title, that.title)
                && Objects.equals(printer, that.printer) && type == that.type && adj == that.adj;
    }

    @Override
    public String toString()
    {
        return "Thing{" +
                "title='" + title + '\'' +
                ", description=" + description +
                ", type=" + type +
                ", adj=" + adj +
                ", place=" + place +
                '}';
    }

}
