import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many digits you want to enter");
		int n = sc.nextInt();
		
		int positive = 0;
		int negative = 0;
		int total = 0;
		double avg = 0.0;
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		for(int i = 0; i < n; i++)
		{
			int num = sc.nextInt();
			
			if(num == 0)
				System.out.println("No numbers are entered except 0");
			
			total += num;
			
			if(num > 0)
				positive++;
			else if(num < 0)
				negative++;
			else if (num == 0)
				break;
			
		}
		avg = total/n;
		
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + avg);
		

	}
}

