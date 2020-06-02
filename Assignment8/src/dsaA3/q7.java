package dsaA3;

public class q7 {

	public static int fact(int n)
	{
		if(n == 0)
			return 1;
		else
		{
			int f = n * fact(n-1);
			return f;
		}
	}
	public static void main(String[] args) {
		
		int factorial = fact(4);
		System.out.println(factorial);

	}

}
