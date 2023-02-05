package utils.entities;

import utils.exceptions.EmptyEntityDescriptionException;

public class EntityKozel extends Entity
{
	public EntityKozel(String description) throws EmptyEntityDescriptionException
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
		return "Козёл";
	}
}
