
public class question15 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int randNum = (int) (a + Math.random() * b);
		System.out.println("random number between " + a + " and " + b + " = " + randNum);
	}

}
