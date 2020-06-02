
public class question18 {

	public static void main(String[] args) {
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		System.out.println("Enter three double values: " + x + " " + y + " " + z);
		
		if(x < y && y < z)
			System.out.println("true");
		
		else if (x > y && y > z)
			System.out.println("true");
		
		else
			System.out.println("false");

	}

}
