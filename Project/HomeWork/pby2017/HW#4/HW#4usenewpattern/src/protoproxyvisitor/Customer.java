/* protoproxyvisitor Customer, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

/** Concrete Prototypes to clone **/
public class Customer extends Account implements Printable {
	// change proto type pattern example (CoconutCookie -> Customer)
	// change proxy pattern example (Printer -> Customer)
	
	private String name = null;
	private String accountNumber = null;
	private int money = 0;
	
	public Customer() {} // normal creator
	
	public Customer(String name, String accountNumber, int money) { // creator for slave proxy
		this.name = name;
		this.accountNumber = accountNumber;
		this.money = money;
		System.out.println("master appearance!!!!!!!!!!");
	}
	
	public void reginfo(String name, String accountNumber, int money) // register information
	{
		this.name = name;
		this.accountNumber = accountNumber;
		this.money = money;
	}
	
	public void deposit(int depMoney)
	{
		/* Check accountNumber and go to next */
		this.money += depMoney;
	}
	
	public int withdraw(int witMoney)
	{
		/* Check accountNumber and go to next */
		if(witMoney > this.money)
		{
			System.out.println("you dont have money like that");
			return 0;
		}
		this.money -= witMoney;
		return witMoney;
	}
	
	public void test()
	{
		System.out.println(name+"'s money: "+money);
	}
	
}