package ru.lxstcxntxry.lab.entities.alive;

import ru.lxstcxntxry.lab.entities.items.Item;
import ru.lxstcxntxry.lab.entities.items.ItemType;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.utils.ConsolePrinter;
import ru.lxstcxntxry.lab.utils.Printer;
import ru.lxstcxntxry.lab.actions.ActionInterface;
import ru.lxstcxntxry.lab.exceptions.ThingIsNotAnItemException;
import ru.lxstcxntxry.lab.places.Place;

import java.util.Objects;

public abstract class AliveEntity
{
	protected final String name;
	protected final Printer printer;

	protected AliveEntity(String name) throws InvalidPropertyException
	{
		if ("".equals(name))
			throw new InvalidPropertyException("#Имя сущности не может быть пустым!");

		this.name = name;
		printer = new ConsolePrinter();
	}

	public void appear()
	{
		printer.printString(name + " появился ");
	}

	public void performAction(ActionInterface act)
	{
		if(act != null)
			printer.printString(name + ": " + act.perform());
	}

	public void looksLike(AliveEntity ent)
	{
		if(ent != null)
			printer.printString(name + " похож на " + ent.name);
	}

	public void located(Place place)
	{
		printer.printString(name + " перемещается в " + place);
	}

	public void manipulate(Item item, ActionInterface manipulationAction)
	{
		if (item.getType() != ItemType.ITEM)
			throw new ThingIsNotAnItemException("#Эта вещь не является предметом");

		printer.printString(name + " " + manipulationAction.perform() + " " + item.getTitle());
	}

	public String getName()
	{
		return name;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(this, name);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AliveEntity aliveEntity = (AliveEntity) o;
		return Objects.equals(name, aliveEntity.name) && Objects.equals(printer, aliveEntity.printer);
	}

	@Override
	public String toString()
	{
		return "Entity{" +
				"description='" + name + '\'' +
				", printer=" + printer +
				'}';
	}
}
