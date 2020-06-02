import java.util.Scanner;

public class q20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		System.out.print("The smallest factors of " + x + " are: ");
		for(int i = 2; i <= 5; i++)
		{
			if(x % i == 0)
				System.out.print(i + " ");
		}

	}

}
