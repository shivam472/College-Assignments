import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input the mark of a student: ");
		int m = sc.nextInt();
		if(m >= 40)
		{
			System.out.println("congratulations! You have passed the exam.");
		}
		
		else
		{
			System.out.println("you have failed the exam.");
		}
		
		

	}

}
