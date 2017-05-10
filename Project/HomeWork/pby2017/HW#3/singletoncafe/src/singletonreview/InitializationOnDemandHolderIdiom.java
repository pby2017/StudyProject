<<<<<<< HEAD
/* singletonreview InitializationOnDemandHolderIdiom, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class InitializationOnDemandHolderIdiom {

	private InitializationOnDemandHolderIdiom () {}
	private static class Singleton {
		private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
	}
	
	public static InitializationOnDemandHolderIdiom getInstance () {
		System.out.println("create instance");
		return Singleton.instance;
	}
	
}
=======
/* singletonreview InitializationOnDemandHolderIdiom, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class InitializationOnDemandHolderIdiom {

	private InitializationOnDemandHolderIdiom () {}
	private static class Singleton {
		private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
	}
	
	public static InitializationOnDemandHolderIdiom getInstance () {
		System.out.println("create instance");
		return Singleton.instance;
	}
	
}
>>>>>>> 1b7d526d34cd244b75682973332a8aac52f61cf5
