import java.util.Scanner;

public class q11 {
	public static int count(String str, char a) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == a)
				count++;
		}
		return(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		int n = count(s, c);
		System.out.println("The no. of times " + c + " occured in the word : " + n);
		

	}

}
