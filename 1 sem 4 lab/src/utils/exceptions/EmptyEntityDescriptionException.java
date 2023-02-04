package utils.exceptions;

public class EmptyEntityDescriptionException extends Exception
{

	private final String description;

	public EmptyEntityDescriptionException(String description)
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
