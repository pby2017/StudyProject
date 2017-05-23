/* usingfirst Woori, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public class Woori implements BankName {

	private String name;
	
	public Woori(String name) {
        this.name = name;
    }
	
	public void accept(BankNameVisitor visitor) {
        visitor.visit(this);
    }
	
}
