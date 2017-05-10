<<<<<<< HEAD
/* singletonreview singletonreview, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class EagerInitialization {
	// declare to private static.
	private static EagerInitialization instance = new EagerInitialization();
	// constructor.
	private EagerInitialization () {
		System.out.println( "call EagerInitialization constructor." );
	}
	// check method.
	public static EagerInitialization getInstance () {
		return instance;
	}
		
	public void print () {
		System.out.println("It's print() method in EagerInitialization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
}
=======
/* singletonreview singletonreview, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class EagerInitialization {
	// declare to private static.
	private static EagerInitialization instance = new EagerInitialization();
	// constructor.
	private EagerInitialization () {
		System.out.println( "call EagerInitialization constructor." );
	}
	// check method.
	public static EagerInitialization getInstance () {
		return instance;
	}
		
	public void print () {
		System.out.println("It's print() method in EagerInitialization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
}
>>>>>>> 1b7d526d34cd244b75682973332a8aac52f61cf5
