import java.util.Scanner;

public class question9 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the x and y pointsnof first point");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.println("enter x and y of the next points");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double x=Math.pow(x2-x1, 2);
		double y=Math.pow(y2-y1, 2);
		double dist=Math.sqrt(x+y);
		System.out.println("the distance between the points is"+dist);

	}
}

