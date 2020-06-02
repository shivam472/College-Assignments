import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("Enter x3 and y3: ");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double a = x2 - x1;
		double b = y2 - y1;
		double c = a + b;
		double s1 = Math.pow(c, 0.5);
		double d = x3 - x2;
		double e = y3 - y2;
		double f = d + e;
		double s2 = Math.pow(f, 0.5);
		double g = x3 - x1;
		double h = y3 - y1;
		double i = g + h;
		double s3 = Math.pow(i, 0.5);
		
		System.out.println("The area of the triangle is: ");
		double s = (s1 + s2 + s3)/2;
		double j = s*(s-s1)*(s-s2)*(s-s3);
		double area = Math.pow(j , 0.5);
		System.out.println(area);

	}

}
