import java.util.Scanner; 
public class question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Number = " + n);
		int sum = 0,x;
		System.out.print("digits = ");
		while(n > 0)
		{
			x = n % 10;
			System.out.print(x);
			n = n / 10;
			sum = sum + x;
				
		}
		System.out.println();
		System.out.println("sum = " + sum);
		if(sum % 9 == 0)
			System.out.println("it is divisible by 9");
		else
			System.out.println("it is not divisible by 9");
	}

}
