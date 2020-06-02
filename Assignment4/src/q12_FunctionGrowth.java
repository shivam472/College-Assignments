
public class q12_FunctionGrowth {

	public static void main(String[] args) {
		
		double logN;
		System.out.println("     log N" + "\t\t" + "    N    " + "\t\t" + "N log N    " + "\t     " + "   N^2" + "\t\t" + "N^3    " + "\t\t\t" + "2^N");
		for(long N = 16; N <= 2048; N = N * 2)
		{
			logN = Math.log(N);
			long powN = (long)(Math.pow(2, N));
			System.out.println(logN + "\t    " + N + "  \t  " + N*logN + "\t\t" + N*N + "\t\t" + N*N*N + "\t\t\t" + powN );
			
		}

	}

}
