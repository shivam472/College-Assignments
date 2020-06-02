import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of which you want the factorial: ");
		int n = sc.nextInt();
		System.out.print(n + "! = ");
		int fact = 1;
		while(n >= 1)
		{
			fact = fact * n;
			n--;
		}
		System.out.print(fact);

	}

}
