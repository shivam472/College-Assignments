import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of students: ");
		int n = sc.nextInt();
		System.out.println();
		int pass = 0;
		for(int i = 1; i <= n; i++)
		{
			System.out.print("Enter the marks of student " + i + " out of 100: ");
			int m = sc.nextInt();
			System.out.println();
			if(m > 40)
				pass++;
		}
		System.out.println("Number of student that have passed the examination = " + pass);
	}

}
