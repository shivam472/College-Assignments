
public class question20 {

	public static void main(String[] args) {
		
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		System.out.println("enter month and date: " + m + " " + d);
		if(m >= 3 && m <= 6)
		{
			if(d >= 1 && d <= 20)
			{
				System.out.println("true");
			}
			else 
			{ 
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("false");
		}

	}

}
