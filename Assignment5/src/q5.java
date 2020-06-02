import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		int n = sc.nextInt();
		int sum = 0;
		double avg = 0;
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i < n; i++)
		{
			int num = sc.nextInt();
			sum += num;
		}
		avg = sum/n;
		System.out.println("resultant sum = " + sum);
		System.out.println("Average = " + avg);

	}

}
