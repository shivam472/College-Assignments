
public class q5 {
	public static boolean isPrime(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		for(int i = 2; i <= 10000; i++)
		{
			boolean p = isPrime(i);
			if(p)
				System.out.println(i);
			
		}

	}

}
