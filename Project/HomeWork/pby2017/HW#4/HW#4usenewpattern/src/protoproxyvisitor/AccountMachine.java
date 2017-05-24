/* protoproxyvisitor AccountMachine, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public class AccountMachine { // change proto type pattern example (CookieMachine -> AccountMachine)

	private Account accoutinfo;

	public AccountMachine(Account accout) {
		this.accoutinfo = accout;
	}
	public Account loadAccount() {
		return (Account)accoutinfo.clone();
	}
	/*public Object clone() {
		return Account.clone();
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account tempAccount1 = null; // 1st proto type pattern object
		Account tempAccount2 = null; // 2nd proto type pattern object
		Printable tempAccount3 = null; // 1st proxy pattern object
		Bank tempAccount4 = null; // 1st visitor pattern object
		Account prot = new Customer(); // before clone(copy)
	    AccountMachine cm = new AccountMachine(prot); // before clone(copy)
	    
	    /*		start proto type pattern test		*/
	    tempAccount1 = cm.loadAccount(); // excute clone
	    tempAccount1.reginfo("pby", "12345", 10000);
	    tempAccount1.withdraw(100);
	    tempAccount1.test();
	    // System.out.println(tempAccount.hashCode()+" "+cm.loadAccount().hashCode()+" "+cm.hashCode()); // for test
	    // tempAccount = cm.loadAccount(); // for test
	    tempAccount1.withdraw(100);
	    tempAccount1.test();
	    // System.out.println(tempAccount.hashCode()+" "+cm.loadAccount().hashCode()+" "+cm.hashCode()); // for test
	    
	    tempAccount2 = cm.loadAccount();
	    tempAccount2.reginfo("aegiz", "54321", 100000000);
	    tempAccount2.withdraw(100);
	    tempAccount2.test();
	    System.out.println("*----------*");
	    
	    /*		start proxy pattern test		*/
	    tempAccount3 = new CustomerProxy();
	    tempAccount3.reginfo("master", "777", 10);
	    tempAccount3.withdraw(5);
	    tempAccount3.test();
	    System.out.println("*----------*");
	    
	    /*		start visit pattern test		*/
	    tempAccount4 = new Bank();
	    tempAccount4.accept(new BankNameDoVisitor());
	}
	
	/*
	 I think that is good to use singleton pattern for managing unique customer object (like name, number, money...)
	*/
	
}
