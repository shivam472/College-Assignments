import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String s = "";
		int rem = 0;
		for(int i = 0; n > 0; i++)
		{
			rem = n % 8;
			s = rem + s;
			n = n /8;
		}
		System.out.println("octal representation = "  + s);

	}

}
