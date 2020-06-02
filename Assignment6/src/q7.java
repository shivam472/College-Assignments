
public class q7 {
	
	public static int isTwinPrime(int number)
	{
		int x = 1;
		for(int i = 2; i <= Math.sqrt(number); i++)
		{
			if(number % i == 0)
				x = 0;
		}
		if(x == 1)
		{
			int num = number + 2;
			for(int i = 2; i <= Math.sqrt(num); i++)
			{
				if(num % i == 0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 2; count <= 100; i = i+2)
		{
			int x = isTwinPrime(i);
			if(x == 1)
			{
				System.out.println("(" + i + ", "  + (i + 2) + ")");
				count++;
			}
			
		}

	}

}
