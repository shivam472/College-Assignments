import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message");
		String s = sc.next();
		int i = 1;
		while(i <= 10)
		{
			if(i == 1)
			{
				System.out.println("1st " + s);
				i++;
			}
			else if(i == 2)
			{
				System.out.println("2nd " + s);
				i++;
			}
			else if(i == 3)
			{
				System.out.println("3rd " + s);
				i++;
			}
			else
			{
				System.out.println(i + "th " + s);
				i++;
			}
		}

	}

}
