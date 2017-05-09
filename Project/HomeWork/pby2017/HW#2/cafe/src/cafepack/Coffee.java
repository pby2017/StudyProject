package cafepack;

public class Coffee {
	
	public static Coffee objcoffee(String coffename)
	{
		if (coffename == null)
		{
			throw new IllegalArgumentException("put correct 'coffee'");
		}
		if (coffename.equals("coffee"))
			return new Coffee();
		else
			return null;
	}
	
	public int checkprice(String coffeename)
	{
		Coffee coffeeprice = Coffeemake.create(coffeename);
		System.out.println("dpd??");
		return coffeeprice.checkprice(coffeename);
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}

}
