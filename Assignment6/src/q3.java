import java.util.Scanner;

	public class q3 {
		
		public static int reverse(int number) {
			
			int reversed = 0;
			int rem = 0;
			while(number > 0)
			{
				rem = number % 10;
				reversed = (reversed * 10) + rem;
				number = number/10;
			}
			return(reversed);
		}
			public static boolean isPalindrome(int number) {
				int reversed = reverse(number);
				if(number == reversed)
					return(true);
				else
					return(false);
			}
			
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			int rev = reverse(n);
			System.out.println("Reverse = " + rev);
			boolean palindrome = isPalindrome(n);
			if(palindrome)
				System.out.println("palindrome");
			else 
				System.out.println("not palindrome");
			
			

		}

	}


