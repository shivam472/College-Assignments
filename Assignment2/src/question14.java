
public class question14 {

	public static void main(String[] args) {
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);
		System.out.println("Enter two positive integers: " + i1 + " " + i2);
		
		if(i1 % i2 == 0)
		{
			System.out.println("true");
		}
		else if (i2 % i1 == 0)
			System.out.println("true");
		else 
			System.out.print("false");
		

	}

}
