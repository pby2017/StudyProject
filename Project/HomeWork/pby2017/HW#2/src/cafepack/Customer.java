package cafepack;

import java.util.Scanner;

public class Customer {

	private static int money = 0;
	private int select = 0;
	private static int mypay = 0;
	private static Menu showmenu = new Menu();
	private static Barista ordercoffee = new Barista();
	private Scanner choice = new Scanner(System.in);;
	
	public Customer()
	{
		money = 1000;
	}
	
	public void selectmessage()
	{		
		while(select!=3)
		{
			select = 0;
			System.out.println("*-------Select your action------*");
			System.out.print("1. Show menu 2. Order menu 3. Out \n");
			System.out.println("*------------------------------*");
			System.out.print("input your choice: ");
			// while (!choice.hasNextInt())
			select = choice.nextInt();
			
			if(select == 1)
			{
				showmenu();
			}
			else if(select == 2)
			{
				ordermenu();
			}
			else if(select == 3)
			{
				System.out.println("Bye");
				break;
			}
		}
	}
	
	public static void showmenu()
	{
		showmenu.show();
	}
	
	private static void ordermenu()
	{
		mypay = ordercoffee.order();
		if(money >= mypay)
		{
			System.out.println("thanks");
			money -= mypay;
		}
		else
			System.out.println("i will pay later sorry");
	}
	
}
