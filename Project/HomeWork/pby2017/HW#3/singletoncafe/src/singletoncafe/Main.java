/* singletoncafe Main, Park ByungYong, qkrquddyd94@naver.com, 17.05.09 */

package singletoncafe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static Customer pby = Customer.getInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		startcafetime();
	}

	public static void startcafetime()
	{
		
		int selectstart = 0;
		Scanner choice = new Scanner(System.in);
		
		
		try
		{
			System.out.print("1.Start 2.Exit : ");
			selectstart = choice.nextInt();
			System.out.println();
		}catch(InputMismatchException ie)
		{
			System.out.println("InputMismatchException!\n");
			choice.next();
		}
		if (selectstart == 1)
		{
			pby.selectAction();
			startcafetime();
		}
		else if(selectstart == 2)
		{
			choice.close();
			pby.scannerclose();
			System.out.println("The End");
		}
		else
		{
			startcafetime();
		}
	}
}
