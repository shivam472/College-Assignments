import java.util.Scanner;
public class question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		int m = sc.nextInt();
		int y = m / 525600; //minutesInYear = 365 * 24 * 60 = 52500
		int d = (m / 60 /24) % 365;
		System.out.println(m + " minutes is approximately " + y + " years " + "and " + d + " days");

	}

}
