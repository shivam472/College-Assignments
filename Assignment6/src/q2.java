
public class q2 {

	public static int getPentagonalNumber(int n) {
		int pentaNum = (n *(3*n-1))/2;
		return(pentaNum);
	}
	public static void main(String[] args) {
		int count = 0;
		System.out.println("The first 100 pentagonal numbers are ");
		for(int i = 1; i <= 100; i++)
		{
			int pentaNum = getPentagonalNumber(i);
			System.out.print(pentaNum + " ");
			count++;
			if(count % 10 == 0)
				System.out.println();
		}
	}
}


