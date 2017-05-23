/* usingfirst Bank, Park ByungYong, qkrquddyd94@naver.com, 17.05.23 */

package protoproxyvisitor;

public class Bank implements BankName{

	BankName[] elements;
	 
    public BankName[] getName() {
        return elements.clone(); // Return a copy of the array of references.
    }
 
    public Bank() {
        this.elements = new BankName[]
          {
        		new Woori("Wibeebank"), new Shinhan("ShinE and HanE")
          };
    }
 
    public void accept(BankNameVisitor visitor) {    
        for(BankName element : this.getName()) {
            element.accept(visitor);
        }
        visitor.visit(this);   
    }
    
}
