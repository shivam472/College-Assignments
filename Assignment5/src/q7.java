import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. upto which you want to find the sum of the series");
		int n = sc.nextInt();
		int sum = 0;
		int sign = 0;
		int i = 1;
		
		while(i <= n)
		{
			sum = sum + i;
			System.out.println(sum);
			i = i + 2;
			sign++;
			if(sign % 2 != 0)
			{
				sum = sum - i;
				System.out.println(sum);
				i = i + 2;
				sign++;
			}
			
			
		}
		System.out.println("sum = " + sum);

	}

}
