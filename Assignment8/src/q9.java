

public class q9 {
	static int rev = 0;
	public static int reverse(int n)
	{	
		if(n > 0)
		{
			int rem = n % 10;
			rev = (rev*10) + rem;
			n = n/10;
			reverse(n);
		}
		else
			return rev;
		return rev;
	}
	public static void main(String[] args) {
		
		int revNum = reverse(12345);
		System.out.println(revNum);

	}

}
