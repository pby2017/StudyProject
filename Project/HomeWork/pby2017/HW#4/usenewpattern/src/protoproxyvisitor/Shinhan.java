/* usingfirst Shinhan, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public class Shinhan implements BankName {

	private String name;
	
	public Shinhan(String name) {
        this.name = name;
    }
	
	public void accept(BankNameVisitor visitor) {
        visitor.visit(this);
    }
	
}
