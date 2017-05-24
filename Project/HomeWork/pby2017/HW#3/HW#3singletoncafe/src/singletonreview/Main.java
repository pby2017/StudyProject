/* singletonreview Main, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EagerInitialization test1 = EagerInitialization.getInstance();
		test1.print();
		StaticBlockInitalization test2 = StaticBlockInitalization.getInstance();
		test2.print();
		LazyInitialization test3 = LazyInitialization.getInstance();
		test3.print();
		ThreadSafeInitalization test4 = ThreadSafeInitalization.getInstance();
		test4.print();
		InitializationOnDemandHolderIdiom test5 = InitializationOnDemandHolderIdiom.getInstance();
		
	}

}
