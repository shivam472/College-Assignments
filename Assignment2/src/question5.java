import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the final velocity initial velocity ands the time taken ");
		double v=sc.nextDouble();
		double u=sc.nextDouble();
		double t=sc.nextDouble();
		double	a=(v-u)/t;
		System.out.println("the acceleration offerd by the moving body is as follow"+a);
	
	}

}

