/* usingfirst BankNameDoVisitor, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public class BankNameDoVisitor implements BankNameVisitor{

	public void visit(Woori woori) {
        System.out.println("You must withdraw at woori bank");
    }
 
    public void visit(Shinhan shinhan) {
        System.out.println("You must deposit at shinhan bank");
    }
 
    public void visit(Bank bank) {
        System.out.println("You have schedule to go to bank today");
    }
	
}
