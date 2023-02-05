package utils.places;

import utils.ConsolePrinter;
import utils.PrinterInterface;
import utils.exceptions.EmptyEntityDescriptionException;

import java.util.Objects;

public abstract class Place {
    private final String description;

    private final PrinterInterface printer;

    public Place(String description) throws EmptyEntityDescriptionException
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
        Place place = (Place) o;
        return Objects.equals(description, place.description) && Objects.equals(printer, place.printer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, printer);
    }

    @Override
    public String toString() {
        return "Place{" +
                "description='" + description + '\'' +
                ", printer=" + printer +
                '}';
    }
}
