import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int A = sc.nextInt();
		System.out.println();
		System.out.print("Enter the annual interest rate: ");
		double AIR = sc.nextDouble();
		AIR = AIR/100;
		System.out.println();
		System.out.print("Enter the no. of months: ");
		int NOM = sc.nextInt();
		System.out.println();
		double MIR = AIR/12; //Monthly Interest Rate
		
		double x = A;//Temporary Variable
		int y = 0;//Temporary Variable
		
		System.out.print("Initial Amount = " + A);
		System.out.println();
		for(int i = 1; i <= NOM; i++)
		{
			x = (y + x) * (1 + MIR);
			y = A;
			
		}
		System.out.println("Account Balance = " + x);
		
		

	}

}
