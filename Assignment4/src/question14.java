import java.util.Scanner;

public class question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int N = sc.nextInt();
		int pow = 0;
		for(int i = 0; i < N; i++)
		{
			if(Math.pow(2, i) < N)
				pow = (int)(Math.pow(2, i));
			
		}
		
		System.out.println("Maximum power of two less than the number = " + pow);
		
	}

}
