package ru.lxstcxntxry.lab.entities.items.impl;

import ru.lxstcxntxry.lab.entities.items.ItemAdjective;
import ru.lxstcxntxry.lab.entities.items.ItemType;
import ru.lxstcxntxry.lab.entities.items.Item;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.Place;

public class DoorItem extends Item
{
	private Sign sign;

	public static class Sign
	{
		private final String title;

		public Sign(String title)
		{
			this.title = title;
		}

		@Override
		public String toString()
		{
			return title;
		}
	}

	public DoorItem(String description, Place place, Sign sign) throws InvalidPropertyException
	{
		super("Дверь", description, ItemType.ITEM, place);
		this.sign = sign;
	}

	public DoorItem(String description, Place place, Sign sign, ItemAdjective adj)
			throws InvalidPropertyException
	{
		super("Дверь", description, ItemType.ITEM, place, adj);
		this.sign = sign;
	}

	@Override
	public void printItem()
	{
		printer.printString( title + " с вывеской " + sign);
	}

	@Override
	public void printDescription()
	{
		printer.printString(description.toString() + sign);
	}
}
