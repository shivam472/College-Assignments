//wrong
public class q6 {
	public static boolean isPalindrome(int number)
	{
		int reversed = 0;
		int rem = 0;
		int num = number;
		while(num > 0)
		{
			rem = num % 10;
			reversed = (reversed * 10) + rem;
			num = num/10;
		} 
		if(number == reversed)
			isPalindromicPrime(number);
		else
			return(false);
		
		return true;
	}
	
	public static boolean isPalindromicPrime(int number)
	{
		for(int i = 2; i <= Math.sqrt(number); i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		int count = 0;
		for(int i = 2; count < 100 ; i++)
		{
			boolean p = isPalindrome(i);
			if(p)
			{
				count++;
				System.out.print(i + " ");
				if(count % 10 == 0)
				{
					System.out.println();
					count = 0;
				}
			}
		}
			
		
	}

}
