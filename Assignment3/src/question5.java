import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three values: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = Math.pow(b*b - 4*a*c, 0.5);
		double r1, r2;
		if(d > 0)
		{
				r1 = (-b + d)/2*a;
				r2 = (-b -d)/2*a;	
				System.out.println("r1 = " + r1);
				System.out.println("r2 = " + r2);
		}
		else if(d == 0)
		{
			r1 = -b/(2*a);
			System.out.println("r1 = " + r1);
		}
		else 
			System.out.println("No real roots");
			
		

	}

}
