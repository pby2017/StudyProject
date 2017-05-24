/* protoproxyvisitor BankNameVisitor, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public interface BankNameVisitor {
	
	void visit(Woori woori);
    void visit(Shinhan shinhan);
    void visit(Bank bank);

}
