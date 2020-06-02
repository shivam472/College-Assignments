
public class question7 {

	public static void main(String[] args) {
		System.out.println("enter an integer");
		int x = Integer.parseInt(args[0]);
		double i = 0;
		double sum = 0, avg = 0;
		System.out.println(x + " random values between 0 and 1 are:");
		while (i < x)
		{
			double randNum = 0 + Math.random() * 1;
			System.out.print(randNum + " ");
			sum = sum + randNum;
			i++;
		}
		avg = sum/x;
		System.out.println();
		System.out.println("average value = " + avg);

	}

}
