package cafepack;

public class Cappuccino extends Coffee {
	
	private int price = 300;
	
	
	public Cappuccino()
	{
		
	}

	public void show()
	{
		System.out.print("cappuccino : " + price + " ");
	}
	
	public int checkprice(String name)
	{
		return price;
	}
	
}
