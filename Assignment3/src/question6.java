import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter six values: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		double x = (e*d - b*f)/(a*d  - b*c);
		double y = (a*f - e*c)/(a*d - b*c);
		if ((a*d - b*c) == 0)
		{
			System.out.println("The equation has no solution");
		}
		else
		{
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}

	}

}
