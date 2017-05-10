package cafepack;

public class Coffeemake {
	public static Coffee create(String coffename)
	{
		if (coffename == null)
		{
			throw new IllegalArgumentException("put correct coffee name");
		}
		if (coffename.equals("espresso"))
			return new Espresso();
		else if (coffename.equals("americano"))
			return new Americano();
		else if (coffename.equals("cappuccino"))
			return new Cappuccino();
		else if (coffename.equals("caramelmacchiato"))
			return new Caramelmacchiato();
		else
			return null;
	}
	
	public static Coffee formenushow(String coffename)
	{
		if (coffename == null)
		{
			throw new IllegalArgumentException("put correct coffee name");
		}
		if (coffename.equals("espresso"))
			return new Espresso();
		else if (coffename.equals("americano"))
			return new Americano();
		else if (coffename.equals("cappuccino"))
			return new Cappuccino();
		else if (coffename.equals("caramelmacchiato"))
			return new Caramelmacchiato();
		else
			return null;
	}
}
