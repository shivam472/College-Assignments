import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]); //command line argument
		System.out.println("enter the no. of lines ");
		System.out.println(n);
		System.out.println("Enter a message");
		String s = sc.next();
		int i = 1;
		while (i < 1000)
		{
			if(i % 10 <= 3 && i % 10 != 0)
			{
				if(i % 10 == 1)
				{
					System.out.println(i + "st " + s);
					i++;
				}
				else if(i % 10 == 2)
				{
					System.out.println(i + "nd " + s);
					i++;
				}
				else if(i % 10 == 3)
				{
					System.out.println(i + "rd " + s);
					i++;
				}
			}
			else
			{
				System.out.println(i + "th " + s);
				i++;
			}
		}
		
		

	}

}
