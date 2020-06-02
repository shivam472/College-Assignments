import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. upto which you want the series: ");
		int n = sc.nextInt();
		int a = 0, b = 1;
		int c = 0;
		System.out.print("Fibonnaci Series: " + a + " " + b);
		for(int i = 2; i < n; i++)
		{
			c = a + b;
			System.out.print(" " + c + " ");
			a = b;
			b = c;
		}
		

	}

}
