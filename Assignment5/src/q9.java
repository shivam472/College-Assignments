import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and n: ");
		int x = sc.nextInt();
		int n = sc.nextInt();
		//calculating factorial
		int fact = 1;
		while(n >= 1)
		{
			fact = fact * n;
			n--;
		}
		double y = Math.pow(x, n)/fact;
		System.out.println(y);

	}

}
