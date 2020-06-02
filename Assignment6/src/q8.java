import java.util.Scanner;

public class q8 {

	public static double area(int n, double side)
	{
		double Area = (n * side * side)/(Math.tan(3.14/n) * 4);
		return(Area);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of sides of the polygon");
		int n = sc.nextInt();
		System.out.println("Enter the length of the side");
		double s = sc.nextDouble();
		System.out.print("The Area of the polygon is: ");
		double A = area(n, s);
		System.out.println(A);
		
	}
}
