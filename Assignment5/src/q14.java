//Fibonnaci Series without using the third variable
import java.util.Scanner;
public class q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. upto which you want the series: ");
		int n = sc.nextInt();
		int a = 0, b = 1;
		System.out.print("Fibonnaci Series: " + a + " " + b + " ");
		for (int i = 2; i < n; i += 2)
		{
			a = a + b;
			b = a + b;
			System.out.print(a + " " + b + " ");
		}

	}

}
