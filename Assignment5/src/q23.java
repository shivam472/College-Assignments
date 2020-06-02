
public class q23 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		System.out.println("Enter an Integer: " + n);
		System.out.println("The prime numbers less than or equal to " + n + " are ");
		for(int i = 2; i <= n; i++)
		{
			boolean k = CheckPrime(i);
			if(k)
				System.out.println(i + " ");
		}
		
	}
	public static boolean CheckPrime(int x) {

		for(int i = 2; i <= Math.sqrt(x); i++)
		{
			if(x % i == 0)
				return false;
		}
		
		return true;
	}
}
