package cafepack;

public class Caramelmacchiato extends Coffee {

	private int price = 400;
	
	public Caramelmacchiato()
	{
		
	}

	public void show()
	{
		System.out.print("caramelmacchiato : " + price + " ");
	}
	
	public int checkprice(String name)
	{
		return price;
	}

}
