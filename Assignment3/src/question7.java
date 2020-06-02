import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if(x == 0)
		{
			
			System.out.println("y-axis");
		}
		else if(y ==0)
		{
			System.out.println("x-axis");
		}
		else if(x >=0 && y >=0)
		{
			System.out.println("1st quadrant");
		}
		else if (x <0 && y >=0)
		{
			System.out.println("2nd quadrant");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("3rd quadrant");
		}
		else 
			System.out.println("4th quadrant");
	}

}
