import java.util.Scanner;

public class q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. " );
		int n = sc.nextInt();
		int x = n;
		String s = "";
		for(int i = 0; x >= 1; i++)
		{
			n = x % 2;
			x = x / 2;
			s = n + s;
		}
		System.out.println("binary representation of the no. is " + s);
		
	}

}
