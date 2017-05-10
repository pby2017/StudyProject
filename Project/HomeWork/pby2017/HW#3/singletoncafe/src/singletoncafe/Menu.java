/* singletoncafe Menu, Park ByungYong, qkrquddyd94@naver.com, 17.05.09 */

package singletoncafe;

import java.util.ArrayList;

public class Menu {

	private static ArrayList<String> coffeeList;
	private static ArrayList<Integer> priceList;
	private static ArrayList<String> coffeematerial;
	private static ArrayList<Integer> materialquantity;
	private static ArrayList<Integer> usematerial;
	
	Coffee getinfo = Coffee.getInstance();
	
	// Constructor
	private Menu()
	{
		coffeeList = new ArrayList<String>();
		priceList = new ArrayList<Integer>();
		coffeematerial = new ArrayList<String>();
		materialquantity = new ArrayList<Integer>();
		usematerial = new ArrayList<Integer>();
		coffeeList = getinfo.returncoffeeList();
		priceList = getinfo.returnpriceList();
		coffeematerial = getinfo.returncoffeematerial();
		materialquantity = getinfo.returnmaterialquantity();
		usematerial = getinfo.returnusematerial();
		
		// coffeeList.add("espresso"); priceList.add(1000);
		// coffeeList.add("americano"); priceList.add(2000);
		// coffeeList.add("cappuccino"); priceList.add(3000);
		// coffeeList.add("caramelmacchiato"); priceList.add(4000);	
	}
	// Declare inner class
	private static class Singleton
	{
		private static final Menu instance = new Menu();
	}
	// Return same constructor
	public static Menu getInstance()
	{
		System.out.println("Create Menu instance");
		return Singleton.instance;
	}
	// Show menu
	public void show()
	{
		for(int i = 0; i < coffeeList.size(); i++)
		{
            System.out.print((i+1) + ". " + coffeeList.get(i) + "(" + priceList.get(i) + ")  ");
        }
		System.out.println("\n");
	}
	// Add menu
	public void addmenu(String menuname, int menuprice)
	{
		if(!coffeeList.contains(menuname))
		{
			coffeeList.add(menuname); priceList.add(menuprice);
		}
		else
		{
			System.out.println("Exist menu\n");
		}
	}
	// Remove menu
	public void removemenu(int menunumber)
	{
		if(menunumber <= coffeeList.size() && menunumber > 0)
		{
			{
				coffeeList.remove(menunumber-1);
				priceList.remove(menunumber-1);
				for(int i=0; i<4; i++)
				{
					usematerial.remove(menunumber * (4));
				}
			}
		}
		else
		{
			System.out.println("No exist menu\n");
		}
	}
}
