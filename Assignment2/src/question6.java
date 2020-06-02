import java.util.Scanner;


public class question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the weight in pounds");
		double pounds=sc.nextDouble();
		double kg=pounds*0.45359237;
		System.out.println("enter the height in inches");
		double inch=sc.nextDouble();
		double meter=inch* 0.0254;
		double bmi=kg/Math.pow(meter , 2);
		System.out.println("the bmi index of the person is " + bmi);
	}
}

