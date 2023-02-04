package utils.exceptions;

public class ThingIsNotAnItemException extends RuntimeException
{

	private final String description;
	public ThingIsNotAnItemException(String description)
	{
		super(description);
		this.description = description;
	}

	@Override
	public String toString()
	{
		return description;
	}
}
