import java.util.Scanner;
public class question11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double Amount = sc.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		double Rate = sc.nextDouble();
		Rate = Rate/100;
		
		System.out.println("Enter number of years: ");
		double Years = sc.nextDouble();
		
		double FutureInvestmentValue = Amount * Math.pow((1 + Rate), Years);
		System.out.println("Accumulated Value = " + FutureInvestmentValue);
		

	}

}
