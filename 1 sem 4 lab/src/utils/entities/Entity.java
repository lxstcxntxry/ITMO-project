package utils.entities;

import items.ThingAbstract;
import support.ThingType;
import utils.ConsolePrinter;
import utils.PrinterInterface;
import utils.actions.Action;
import utils.exceptions.EmptyEntityDescriptionException;
import utils.exceptions.ThingIsNotAnItemException;
import utils.places.Place;

import java.util.Objects;

public abstract class Entity {
    private final String description;
    private final PrinterInterface printer;

    public Entity(String description) throws EmptyEntityDescriptionException
    {
        if ("".equals(description))
            throw new EmptyEntityDescriptionException("укажите имя для сущности!");

        this.description = description;
        printer = new ConsolePrinter();
    }

    public void appear()
    {
        getPrinter().printString(getDescription() + " появился");
    }

    public void performAction(Action act){
        if(act != null)
            getPrinter().printString(this + ": " + act.perform());
    }

    public void looksLike(Entity ent){
        if(ent != null)
            getPrinter().printString(this + " похож на " + ent);
    }

    public void located(String str){
        getPrinter().printString(this + " находится на " + str);
    }

    public void located(Place pl){
        getPrinter().printString(this + " перемещается в " + pl);
    }

    public void manipulate(ThingAbstract item, String manipulationDescriptor)
    {
        if (item.getType() != ThingType.ITEM)
            throw new ThingIsNotAnItemException("эта вещь не является предметом");
        else
            getPrinter().printString(String.format("%s %s %s", getDescription(), manipulationDescriptor, item));
    }

    public void manipulate(Entity entity, String manipulationDescriptor)
    {
        getPrinter().printString(String.format("%s %s %s", getDescription(), manipulationDescriptor, entity));
    }

    public abstract String stringify();

    public String getDescription() {
        return description;
    }
    public PrinterInterface getPrinter() {
        return printer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(description, entity.description) && Objects.equals(printer, entity.printer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, printer);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "description='" + description + '\'' +
                ", printer=" + printer +
                '}';
    }
}
