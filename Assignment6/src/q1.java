import java.util.Scanner;
public class q1 {
	
	public static int additionSimple(int x, int y) {
	
		int add = x + y;
		return(add);
		
	}
	public static int subtractionSimple(int x, int y) {
		
		int subtract = x - y;
		return(subtract);
	}
	public static int multiplicationSimple(int x, int y) {
		
		int multi = x * y;
		return(multi);
	}
	public static double divisionSimple(int x, int y) {
		
		double div = x / y;
		return(div);
	}
	public static int remainderSimple(int n, int m) {
		int rem = n % m;
		return(rem);
	}
	public static double squareRootSimple(int n) {
		double squareroot = Math.sqrt(n);
		return(squareroot);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose: (1)Addition / (2)Subtraction / (3)Multiplication / (4)Division / (5)Remainder / (6)Square root");
		int n = sc.nextInt();
		if(n == 1)
		{
			System.out.println("Enter two numbers that you want to add ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int addition = additionSimple(x, y);
			System.out.print("addition result = " + addition);
			System.out.println();
		}
		else if(n == 2)
		{
			System.out.println("Enter two numbers that you want to subtract ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int subtraction = subtractionSimple(x,y);
			System.out.println("subtraction result = " + subtraction);
		}
		else if(n == 3)
		{
			System.out.println("Enter two numbers that you want to multiply ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int multiplication = multiplicationSimple(x, y);
			System.out.println("multiplication result = " + multiplication);
		}
		else if(n == 4)
		{
			System.out.println("Enter two numbers that you want to divide ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			double division = divisionSimple(x, y);
			System.out.println("division result = " + division);
		}
		else if(n == 5)
		{
			System.out.println("Enter two numbers to get the remainder ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int remainder = remainderSimple(x, y);
			System.out.println("remainder = " + remainder);
		}
		else if(n == 6)
		{
			System.out.println("Enter a number of which you want the square root of ");
			int x = sc.nextInt();
			double sqrt = (squareRootSimple(Math.abs(x)));
			System.out.println("Squareroot = " + sqrt);	
		}
		else 
			System.out.println("Invalid Number");
		
	}
}
