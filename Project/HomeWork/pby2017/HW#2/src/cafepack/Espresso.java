package cafepack;

public class Espresso extends Coffee {

	private int price = 100;
	
	public Espresso()
	{
		
	}
	
	public void show()
	{
		System.out.print("espresso : " + price + " ");
	}
	
	public int checkprice(String name)
	{
		return price;
	}
	
}
