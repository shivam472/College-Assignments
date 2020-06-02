import java.util.Scanner;
public class q13 {
	
	public static void isPalindrome(String str)
	{
		
		String rev = ""; 
		for(int i = str.length()-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		System.out.println("reverse = " + rev);
		if(rev == str)
			System.out.println("the string is palindrome");
		else
			System.out.println("not a palindrome");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		isPalindrome(str);
		

	}

}
