<<<<<<< HEAD
/* singletonreview LazyInitialization, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class LazyInitialization {

	private static LazyInitialization instance;
	private LazyInitialization () {}
	
	public static LazyInitialization getInstance () {
		if ( instance == null )
			instance = new LazyInitialization();
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in LazyInitialization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	
}
=======
/* singletonreview LazyInitialization, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class LazyInitialization {

	private static LazyInitialization instance;
	private LazyInitialization () {}
	
	public static LazyInitialization getInstance () {
		if ( instance == null )
			instance = new LazyInitialization();
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in LazyInitialization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	
}
>>>>>>> 1b7d526d34cd244b75682973332a8aac52f61cf5
