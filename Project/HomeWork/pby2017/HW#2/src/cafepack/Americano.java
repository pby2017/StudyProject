package cafepack;

public class Americano extends Coffee {
	
	private int price = 200;
	
	public Americano()
	{
		
	}
	
	public void show()
	{
		System.out.print("americano : " + price + " ");
	}
	
	public int checkprice(String name)
	{
		return price;
	}
	
}
