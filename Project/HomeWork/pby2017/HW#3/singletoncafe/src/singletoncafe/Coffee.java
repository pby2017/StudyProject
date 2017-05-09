/* singletoncafe Coffee, Park ByungYong, qkrquddyd94@naver.com, 17.05.09 */

package singletoncafe;

import java.util.ArrayList;

public class Coffee {

	String name = null;
	int price = 0;
	private static ArrayList<String> coffeeList;
	private static ArrayList<Integer> priceList;
	private static ArrayList<String> coffeematerial;
	private static ArrayList<Integer> materialquantity;
	private static ArrayList<Integer> usematerial;
	// Constructor
	private Coffee()
	{
		coffeeList = new ArrayList<String>();
		priceList = new ArrayList<Integer>();
		coffeematerial = new ArrayList<String>();
		materialquantity = new ArrayList<Integer>();
		usematerial = new ArrayList<Integer>();
		// Coffee info
		coffeeList.add("Espresso"); priceList.add(1000);
		coffeeList.add("Americano"); priceList.add(2000);
		coffeeList.add("Cappuccino"); priceList.add(3000);
		coffeeList.add("Caramelmacchiato"); priceList.add(4000);
		// Material
		coffeematerial.add("coffeebeans"); materialquantity.add(10);
		coffeematerial.add("milk"); materialquantity.add(10);
		coffeematerial.add("ice"); materialquantity.add(10);
		coffeematerial.add("caramel"); materialquantity.add(10);	
		// Espresso, Americano, Cappuccino, Caramelmacchiato
		usematerial.add(1);usematerial.add(0);usematerial.add(0);usematerial.add(0);
		usematerial.add(1);usematerial.add(0);usematerial.add(0);usematerial.add(0);
		usematerial.add(1);usematerial.add(1);usematerial.add(0);usematerial.add(0);
		usematerial.add(1);usematerial.add(1);usematerial.add(0);usematerial.add(1);
	}
	// Declare inner class
	private static class Singleton
	{
		private static final Coffee instance = new Coffee();
	}
	// Return same constructor
	public static Coffee getInstance()
	{
		System.out.println("Create Coffee instance");
		return Singleton.instance;
	}
	// send coffeeList info to Menu
	public ArrayList<String> returncoffeeList()
	{
		return coffeeList;
	}
	// send priceList info to Menu
	public ArrayList<Integer> returnpriceList()
	{
		return priceList;
	}
	// send coffeematerial info to Menu
	public ArrayList<String> returncoffeematerial()
	{
		return coffeematerial;
	}
	// send materialquantity info to Menu
	public ArrayList<Integer> returnmaterialquantity()
	{
		return materialquantity;
	}
	public ArrayList<Integer> returnusematerial()
	{
		return usematerial;
	}
}
