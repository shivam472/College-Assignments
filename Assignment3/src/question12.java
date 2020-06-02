import java.util.Scanner;
public class question12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three intgers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b)
		{
			if (a < c)
			{
				if(b < c)
					System.out.println("Display the integers in non-decreasing order: " + a + ", " + b + ", " + c);
				
				else 
					System.out.println("Display the integers in non-decreasing order: " + a + ", " + c + ", " + b);
			}
		}
		
		else if(b < c)
		{
			if(a < c)
				System.out.println("Display the integers in non-decreasing order: " + b + ", " + a + ", " + c);
			else
				System.out.println("Display the integers in non-decreasing order: " + b + ", " + c + ", " + a);
		}
		
		else if(c < a)
			System.out.println("Display the integers in non-decreasing order: " + c + ", " + b + ", " + a);

	}

}
