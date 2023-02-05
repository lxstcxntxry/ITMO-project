package items;

import support.ThingAdjective;
import support.ThingType;
import utils.exceptions.EmptyEntityDescriptionException;

public class ThingDoor extends ThingAbstract
{

	public static class Sign
	{
		private final String title;

		public Sign(String title)
		{
			this.title = title;
		}

	}

	private Sign sign;

	public ThingDoor(String name, Sign sign) throws EmptyEntityDescriptionException
	{
		super(name, ThingType.ITEM);
		this.sign = sign;
	}

	@Override
	public void printItem()
	{
		getPrinter().printString(String.format("%s с вывеской '%s'", getName(), sign.title));
	}

	@Override
	public void printDescription() {
		getPrinter().printString(getDescription());
	}

	@Override
	public String addAdjective(ThingAdjective adj)
	{
		return adj.toString();
	}

	@Override
	public String addType(ThingType type)
	{
		return type.toString();
	}
}
