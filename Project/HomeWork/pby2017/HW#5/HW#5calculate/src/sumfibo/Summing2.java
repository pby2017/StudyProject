/* sumfibo Summing2, Park ByungYong, qkrquddyd94@naver.com, 17.05.24 */

package sumfibo;

public class Summing2 {

	public static int fibo(int fifirst, int fisecond, int fin) // fibo(fin = stage or level)
	{
		int fiboresult = fifirst + fisecond;
		int count = fin;
		if(count-- <= 0)
		{
			return fisecond;
		}
		return fibo(fisecond, fiboresult, count); // 1+2, 2+3, 3+5, 
	}
	
	public static int fiboodd(int fofirst, int fosecond, int fomax) // fibo odd sum
	{
		int foa = 0;
		int foresult = 0;
		for(int i=1; fibo(fofirst, fosecond, i) < fomax ;i++)
		{
			foa = fibo(fofirst, fosecond, i);
			if(i%3 == 0)
			{
				foresult += foa;
			}
		}
		return foresult;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 1, a2 = 2, max = 4000000;
		System.out.println(fiboodd(a1,a2,max) + a2);
	}

}
