<<<<<<< HEAD
/* singletonreview ThreadSafeInitalization, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class ThreadSafeInitalization {

	private static ThreadSafeInitalization instance;
	private ThreadSafeInitalization () {}
	
	public static synchronized ThreadSafeInitalization getInstance () {
		if (instance == null)
			instance = new ThreadSafeInitalization();
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in ThreadSafeInitalization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	
}
=======
/* singletonreview ThreadSafeInitalization, Park ByungYong, qkrquddyd94@naver.com, 17.0?.?? */

package singletonreview;

public class ThreadSafeInitalization {

	private static ThreadSafeInitalization instance;
	private ThreadSafeInitalization () {}
	
	public static synchronized ThreadSafeInitalization getInstance () {
		if (instance == null)
			instance = new ThreadSafeInitalization();
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in ThreadSafeInitalization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	
}
>>>>>>> 1b7d526d34cd244b75682973332a8aac52f61cf5
