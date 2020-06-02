
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("Enter your lucky number: ");
			int n = sc.nextInt();
			if(n < 0)
				throw new NumberFormatException("negative numbers can't be lucky nummbers");
			else
				System.out.println("your lucky number is: " + n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
