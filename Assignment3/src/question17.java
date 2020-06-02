import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x = sc.nextInt();
		
		System.out.println("Is x divisible by 5 and 6?");
		if(x % 5 == 0 && x % 6 ==0)
			System.out.println("true");
		else 
			System.out.println("false");
		
		System.out.println("Is x divisible by 5 or 6?");
		if(x % 5 == 0 || x % 6 == 0)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("Is 10 divisible by 5 or 6, but not both?");
		if(x % 5 == 0 || x % 6 == 0)
		{
			if(x % 5 == 0 && x % 6 == 0)
				System.out.println("false");
			else
				System.out.println("true");
		}

	}

}
