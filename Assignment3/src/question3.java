import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input an integer");
		int x = sc.nextInt();
		if(x % 2 == 0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}

	}

}
