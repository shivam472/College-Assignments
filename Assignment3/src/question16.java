import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the marks: ");
		int m = sc.nextInt();
		if(m >= 90)
			System.out.println("Grade = O");
		else if(m >= 80)
			System.out.println("Grade = A");
		else if(m >= 70)
			System.out.println("Grade = B");
		else if(m >= 60)
			System.out.println("Grade = C");
		else if(m >= 50)
			System.out.println("Grade = D");
		else if(m >= 40)
			System.out.println("Grade = E");
		else 
			System.out.println("Grade = F");
	}

}
