/* protoproxyvisitor Printable, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public interface Printable {  // change proxy pattern example (Printable's contents)

	public abstract void reginfo(String name, String accountNumber, int money);
	public abstract void deposit(int depMoney);
	public abstract int withdraw(int witMoney);
	public abstract void test();
	
}
