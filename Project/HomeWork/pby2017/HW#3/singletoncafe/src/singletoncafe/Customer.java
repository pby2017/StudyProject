/* singletoncafe Customer, Park ByungYong, qkrquddyd94@naver.com, 17.05.09 */

package singletoncafe;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer
{
	int money = 0, select = 0, coffeeprice = 0;
	private Scanner choice = new Scanner(System.in);
	private static ArrayList<String> actionList;
	Menu menu = Menu.getInstance();
	Coffee coffee = Coffee.getInstance();
	Barista barista = Barista.getInstance();
	
	// Constructor
	private Customer()
	{
		money = 10000;
	}
	// Declare inner class
	private static class Singleton
	{
		private static final Customer instance = new Customer();
	}
	// Return same constructor
	public static Customer getInstance()
	{
		System.out.println("Create Customer instance");
		return Singleton.instance;
	}
	// Select my action 1. exit, 2. show menu, 3. etc...
	public void selectAction()
	{
		actionlist();
		System.out.println("-----Select your action-----");
		for(int i = 0; i < actionList.size(); i++)
		{
            System.out.print((i+1) + ". " + actionList.get(i) + "  ");
        }
		System.out.print("\ninput your choice: ");
		
		try
		{
			select = choice.nextInt();
		}catch(InputMismatchException ie)
		{
			System.out.println("InputMismatchException!");
			choice.next();
		}
		
		if(select == 1)
		{
			System.out.println("Bye");
			return;
		}
		else if(select == 2)
		{
			showmenu();
		}
		else if(select == 3)
		{
			moneycheck();
		}
		else if(select == 4)
		{
			ordermenu();
			if(checkforpay() == false)
			{
				System.out.println("Oh I have no money for paying");
			}
			else
			{
				usemoney(coffeeprice);
				barista.continuepay();
				System.out.println("My money : " + money);
			}
		}
		else if(select == 5)
		{
			requestadd();
		}
		else if(select == 6)
		{
			requestremove();
		}
		selectAction();
	}
	// Manage action list
	private void actionlist()
	{
		actionList = new ArrayList<String>();
		actionList.add("exit");
		actionList.add("show menu");
		actionList.add("money check");
		actionList.add("order");
		actionList.add("request to add menu");
		actionList.add("request to remove menu");
	}
	// Show menu
	private void showmenu()
	{
		menu.show();
	}
	// Check my money 
	private void moneycheck()
	{
		System.out.println("My money : " + money + "\n");
	}
	// Check my money for paying coffee price
	private boolean checkforpay()
	{
		if(money < coffeeprice)
		{
			return false;
		}
		return true;
	}
	// Order
	private void ordermenu()
	{
		coffeeprice = barista.order();
	}
	// Request add menu
	private void requestadd()
	{
		barista.requestadd();
	}
	// Request remove menu
	private void requestremove()
	{
		barista.requestremove();
	}
	// Pay for order
	private int usemoney(int money)
	{
		this.money -= money;
		return this.money;
	}
	public void scannerclose()
	{
		barista.scannerclose();
	}
}
