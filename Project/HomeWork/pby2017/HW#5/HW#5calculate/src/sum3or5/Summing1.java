/* sum3or5 Summing1, Park ByungYong, qkrquddyd94@naver.com, 17.05.24 */

package sum3or5;

public class Summing1 {
	
	public static int returnN(int reNumber, int remax) // 3, 1000
	{
		int tempNumber = remax - (reNumber + 1); // if 3, 996
		int tempmax = 0;
		for(int i=0; (tempNumber+i)<remax; i++) // 996+0,1,2,3 < 1000
		{
			if((tempNumber+i) % reNumber == 0) // (996+0) / 3, (996+3) / 3 
			{
				if(tempmax < tempNumber+i) // 996 < 999
				{
					tempmax = (tempNumber+i) / reNumber; // 999 / 3
				}
			}
		}
		return tempmax;
	}
	
	public static int sigmacalcul(int signum, int sigmax)
	{
		return (signum * sigmax)*(sigmax+1)/2;
	}

	public static int sigmacalculappl(int sigappnum, int sigappmax) // 3, 1000
	{
		int n = returnN(sigappnum, sigappmax); // 333
		return sigmacalcul(sigappnum,n);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sigmacalculappl(3,1000)+sigmacalculappl(5,1000)-sigmacalculappl(15,1000));
		
	}

}
