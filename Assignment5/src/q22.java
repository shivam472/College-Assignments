import java.util.Scanner;

public class q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		boolean k = CheckPrime(x);
		if(k)
			System.out.println(x + " is a prime number");
		else
			System.out.println(x + " is not a prime number");
		

	}


	public static boolean CheckPrime(int x) {
		if(x <= 1)
			return false;
		for(int i = 2; i <= Math.sqrt(x); i++)
		{
			if(x % i == 0)
				return false;
		}
		
		return true;
		

	}
}
