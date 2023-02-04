package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityNeznayka extends Entity
{
	public EntityNeznayka(String description) throws EmptyEntityDescriptionException
	{
		super(description);
	}

	@Override
	public String stringify()
	{
		return getDescription();
	}

	@Override
	public String toString()
	{
		return "Незнайка";
	}
}
