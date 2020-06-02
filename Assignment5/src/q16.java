import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. of which you want the reverse: ");
		String s = sc.next();
		int l = s.length();
		String rev = "";
		for(int i = l - 1 ; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse order: " + rev);

	}

}
