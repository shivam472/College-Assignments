
public class question22 {

	public static void main(String[] args) {
		
		double P = Double.parseDouble(args[0]);
		double N = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		System.out.println("Enter Principle Amount, Number of Years, Annual Rate of Interest: " + P + " " + N + " " + R + "%");
		double MP = P * Math.exp(R * N);
		System.out.println();
		System.out.println("Monthly payments you would have to make over " + N + " years = " + MP);
		
		

	}

}
