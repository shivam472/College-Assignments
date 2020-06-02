import java.util.Scanner;
public class question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter weight");
		double w = sc.nextDouble();
		System.out.println("enter height");
		double h = sc.nextDouble();
		double BMI = w/(h*h);
		if(BMI < 18.5)
			System.out.println("Underweight");
		else if(BMI < 24.9)
			System.out.println("normal weight");
		else if(BMI < 29.9)
			System.out.println("overweight");
		else 
			System.out.println("obese");
	
	}
}