import java.util.Scanner;
public class question12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of eggs: ");
		int N = sc.nextInt();
		int Dozens = N / 12;
		int Leftovers = N % 12;		
		int gross = N / 144;
		System.out.println("Your No. of eggs " + N + ", " + gross + " gross, " + Dozens + " dozens, " + Leftovers + " leftovers");
		
		
		
		

	}

}
