
public class question17 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println("Enter three positive integers: " + a + " " + b + " " + c);
		if(a + b >= c)
			System.out.println("true");
		
		else if(b + c >= a)
			System.out.println("true");
			
		else if (a + c >= b)
			System.out.println("true");
		
		else
			System.out.println("false");
		

	}

}
