
public class question24 {

	public static void main(String[] args) {
		
		double randNum1 = (double) (0 + Math.random() * 1);
		double randNum2 = (double) (0 + Math.random() * 1);
		double randNum3 = (double) (0 + Math.random() * 1);
		double randNum4 = (double) (0 + Math.random() * 1);
		double randNum5 = (double) (0 + Math.random() * 1);
		System.out.println("The 5 random values between 0 and 1 are " + randNum1 + " " + randNum2 + " " + randNum3 + " " + randNum4 + " " + randNum5);
		double max = Math.max(Math.max(Math.max(randNum1, randNum2), Math.max(randNum3, randNum4)), randNum5);
		System.out.println("maximum = " + max);
		double min = Math.min(Math.min(Math.min(randNum1, randNum2), Math.min(randNum3, randNum4)), randNum5);
		System.out.println("minimum = " + min);
		

	}

}
