package items;

import support.ThingAdjective;
import support.ThingType;
import utils.ConsolePrinter;
import utils.entities.Entity;
import utils.entities.EntityWindow;
import utils.PrinterInterface;
import utils.exceptions.EmptyEntityDescriptionException;

import java.util.Objects;


public abstract class ThingAbstract {
    private Entity entity;
    private String name;
    private PrinterInterface printer;
    private final ThingType type;
    private ThingAdjective adj;

    private ThingDescription thingDescription;

    private class ThingDescription
    {
        private final String description;

        public ThingDescription(String description)
        {
            this.description = description;
        }

        public String getDescription()
        {
            return description;
        }
    }

    public ThingAbstract(String name, ThingType type) throws EmptyEntityDescriptionException
    {
        this.name = name;
        this.type = type;
        entity = new EntityWindow("[дефолтное окно]");
        printer = new ConsolePrinter();
    }

    public ThingAbstract(String name, Entity entity, ThingType type){
        this.type = type;
        this.name = name;
        this.entity = entity;
        printer = new ConsolePrinter();

    }

    public ThingAbstract(String name, Entity entity, ThingAdjective adj, ThingType type) {
        this.name = name;
        this.entity = entity;
        this.adj = adj;
        this.type = type;
        printer = new ConsolePrinter();
    }

    public abstract void printItem();
    public abstract String addAdjective(ThingAdjective adj);
    public abstract String addType(ThingType type);



    public ThingAbstract setDescription(String description)
    {
        thingDescription = new ThingDescription(description);
        return this;
    }

    public String getDescription()
    {
        return thingDescription.getDescription();
    }

    public void looksLike(ThingAbstract thg){
        if(thg != null)
            getPrinter().printString(this + " " + addType(getType()) + "похожа на " + thg + " " + thg.getType());
    }


    public void setPlace(Entity entity) {
        this.entity = entity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrinter(PrinterInterface printer) {
        this.printer = printer;
    }

    public Entity getPlace() {
        return entity;
    }

    public String getName() {
        return "'" + name + "' ";
    }

    public PrinterInterface getPrinter() {
        return printer;
    }

    public ThingAdjective getAdj() {
        return adj;
    }

    public ThingType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThingAbstract that = (ThingAbstract) o;
        return Objects.equals(entity, that.entity) && Objects.equals(name, that.name)
                && Objects.equals(printer, that.printer) && type == that.type && adj == that.adj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, name, printer, type, adj);
    }

    @Override
    public String toString() {
        return name;
    }
}
