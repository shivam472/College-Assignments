
public class question21 {

	public static void main(String[] args) {
		
		double t = Double.parseDouble(args[0]);
		t = Math.toRadians(t); 		// convert to radians
		System.out.println("Enter a no. " + t);
		double  t2 = Math.sin(2 * t) + Math.sin(3 * t);
		System.out.println(t2);
		

	}

}
