import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table: ");
		int x = sc.nextInt();
		int m;
		for(int i = 1; i <= 10; i++)
		{
			m = x * i;
			System.out.println(x + "*" + i + "=" + m);
		}

	}

}
