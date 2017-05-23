/* usingfirst Account, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

/** Prototype Class **/
public class Account implements Cloneable { // change proto type pattern example (Cookie -> Account)

	public Object clone() {
		try {
			Account copy = (Account)super.clone();

			//In an actual implementation of this pattern you might now change references to
			//the expensive to produce parts from the copies that are held inside the prototype.

			return copy;

		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
   
	public void reginfo(String name, String accountNumber, int money) {}
	
	public void deposit(int depMoney) {}
	
	public int withdraw(int witMoney)
	{
		return 0;
	}
	
	public void test() {}
   
}
