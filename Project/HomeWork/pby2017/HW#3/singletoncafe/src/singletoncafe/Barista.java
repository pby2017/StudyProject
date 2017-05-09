/* singletoncafe Barista, Park ByungYong, qkrquddyd94@naver.com, 17.05.09 */

package singletoncafe;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Barista {
	
	int menuprice = 0, menunumber = 0, ordercoffee = 0, orderice = 0, ordershot = 0, lastprice = 0;
	String menuname = null;
	private Scanner menuscan = new Scanner(System.in);
	private Scanner orderscan = new Scanner(System.in);
	Menu menu = Menu.getInstance();
	Coffee coffee = Coffee.getInstance();
	private static ArrayList<String> orderList;
	private static ArrayList<String> coffeeList;
	private static ArrayList<Integer> priceList;
	private static ArrayList<Integer> materialquantity;
	private static ArrayList<Integer> usematerial;
	
	private static ArrayList<String> coffeematerial;

	// Constructor
	private Barista()
	{
		coffeeList = new ArrayList<String>();
		priceList = new ArrayList<Integer>();
		materialquantity = new ArrayList<Integer>();
		usematerial = new ArrayList<Integer>();
		coffeeList = coffee.returncoffeeList();
		priceList = coffee.returnpriceList();
		materialquantity = coffee.returnmaterialquantity();
		usematerial = coffee.returnusematerial();
		
		coffeematerial = new ArrayList<String>();
		coffeematerial = coffee.returncoffeematerial();
	}
	// Declare inner class
	private static class Singleton
	{
		private static final Barista instance = new Barista();
	}
	// Return same constructor
	public static Barista getInstance()
	{
		System.out.println("Create Barista instance");
		return Singleton.instance;
	}
	// Start order stage
	public int order()
	{
		orderlist();
		try
		{
			// What menu number?
			System.out.print(orderList.get(0) + " : ");
			ordercoffee = orderscan.nextInt();
			if(coffeecheck(ordercoffee) == false)
			{
				System.out.println("We have no materials for " + coffeeList.get(ordercoffee-1));
				return 0;
			}
			System.out.println();
			// 1. Ice or 2. Hot?
			System.out.print(orderList.get(1) + " : ");
			orderice = orderscan.nextInt();
			if(orderice == 1)
			{
				if(icecheck() == false)
				{
					System.out.println("We have no ice");
					return 0;
				}
			}
			System.out.println();
			// 1. Add shot or 2. No?
			System.out.print(orderList.get(2) + " : ");
			ordershot = orderscan.nextInt();
			if(ordershot == 1)
			{
				if(shotcheck() == false)
				{
					System.out.println("We have no beans for adding shot");
					return 0;
				}
			}
			System.out.println();
			
			return calprice();
		}catch(InputMismatchException ie)
		{
			System.out.println("InputMismatchException!");
			orderscan.next();
		}
		
		
		return 0;
	}
	public void continuepay()
	{
		for(int i=0; i<4; i++)
		{
			materialquantity.set(i, (materialquantity.get(i) - usematerial.get(i*ordercoffee)));
		}
		for(int i=0; i<4; i++)
		{
			System.out.println("coffeematerial" + coffeematerial + "materialquantity" + materialquantity);
		}
		System.out.println("Here your " + coffeeList.get(ordercoffee-1));
	}
	// Manage order list
	private void orderlist()
	{
		orderList = new ArrayList<String>();
		orderList.add("What menu number?");
		orderList.add("1. Ice or 2. Hot?");
		orderList.add("1. Add shot or 2. No?");
		orderList.add("Price");
	}
	// Material check
	public boolean coffeecheck(int ordercoffee)
	{
		for(int i=0; i<4; i++)
		{
			if(!((materialquantity.get(i) - usematerial.get(i*ordercoffee)) > 0))
			{
				return false;
			}
		}
		return true;
	}
	// Ice check
	public boolean icecheck()
	{
		if(materialquantity.get(2) == 0)
		{
			return false;
		}
		return true;
	}
	// Shot beans check
	public boolean shotcheck()
	{
		if(!(materialquantity.get(0) - 1 > 0))
		{
			return false;
		}
		return true;
	}
	// Calculate price
	public int calprice()
	{
		lastprice = 0;
		lastprice += priceList.get(ordercoffee-1);
		if(ordershot == 1)
		{
			lastprice += 100;
		}
		
		return lastprice;
	}
	// Request add menu
	public void requestadd()
	{
		try
		{
			// Add create object because nextLine instruction is jumped at second request
			menuscan = new Scanner(System.in);
			System.out.print("Request menu");
			menuname = menuscan.nextLine();
			System.out.print("Request price");
			menuprice = menuscan.nextInt();
		}catch(InputMismatchException ie)
		{
			System.out.println("InputMismatchException!");
			menuscan.next();
		}
		menu.addmenu(menuname, menuprice);
		
	}
	// Request remove menu
	public void requestremove()
	{
		try
		{
			System.out.print("Tell menu number");
			menunumber = menuscan.nextInt();
		}catch(InputMismatchException ie)
		{
			System.out.println("InputMismatchException!");
			menuscan.next();
		}
		menu.removemenu(menunumber);
	}
	// Close scanner
	public void scannerclose()
	{
		menuscan.close();
		orderscan.close();
	}
}
