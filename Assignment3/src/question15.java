import java.util.Scanner;
public class question15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double d = Math.pow(((x * x) + (y * y)), 0.5);
		if(d <= 10)
			System.out.println("Point(" + x +", " + y + ")" + " is in the circle");
		else
			System.out.println("Point(" + x +", " + y + ")" + " is not in the circle");
			

	}

}
