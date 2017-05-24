/* protoproxyvisitor CustomerProxy, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public class CustomerProxy implements Printable { // change proxy pattern example (PrinterProxy -> CustomerProxy)

	private String name = null;
	private String accountNumber = null;
	private int money = 0;

    private Customer real = null; // master

    public CustomerProxy() {}
    
    public synchronized void reginfo(String name, String accountNumber, int money)
	{
    	if (real != null)
    	{
    		real.reginfo(name, accountNumber, money);
    	}
    	this.name = name;
		this.accountNumber = accountNumber;
		this.money = money;
	}
	
	public void deposit(int depMoney)
	{
		this.money += depMoney;
	}
	
	public int withdraw(int witMoney)
	{
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
		realize(); // master appearance
		real.test();
	}
	
	private synchronized void realize() // create master
	{
		if (real == null)
		{            
			real = new Customer(name, accountNumber, money);
        }
    }
	
}
