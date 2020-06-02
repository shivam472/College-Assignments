import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'n' to find the harmonic mean ");
		int n = sc.nextInt();
		double H;
		double sum = 0.0;
		for(int i = 1; i <= n; i++)
		{
			System.out.print("enter 'a' for " + i + "th term: ");
			double a = sc.nextDouble();
			sum = sum  + 1/a;
		}
		H = n/sum;
		System.out.println(H);
		

	}

}
