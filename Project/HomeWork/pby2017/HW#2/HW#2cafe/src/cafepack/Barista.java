package cafepack;

import java.util.Scanner;

public class Barista {

	private String coffeename=null, coldorhot=null, shot=null, size=null;
	private int addfee=0;
	private Scanner sorder = new Scanner(System.in);
	
	public int order()
	{
		addfee = 0;
		
		System.out.print("What coffee? ");
		coffeename = sorder.next();
		Coffee yourcoffee = Coffeemake.create(coffeename);
		
		System.out.print("cold? hot? ");
		coldorhot = sorder.next();
		
		System.out.print("how many shot one or two? ");
		shot = sorder.next();
		
		System.out.print("what size small or large(+50)? ");
		size = sorder.next();
		if(size.equals("large"))
			addfee = 50;
		
		addfee += yourcoffee.checkprice(coffeename);
		System.out.println(addfee +"won please");
		
		System.out.println("here your beverage");
		System.out.println();
		return addfee;
		
	}

}
