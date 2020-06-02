import java.util.Scanner;

public class question18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your gender?(M or F):");
		char gender = sc.next().charAt(0);
		System.out.println("First name:");
		String fName = sc.next();
		System.out.println("Last name:");
		String lName = sc.next();
		System.out.println("Age:");
		int age = sc.nextInt();
		if(gender == 'F')
		{
			if(age >= 20)
			{
				System.out.println("Are you married " + fName + " ?(y or n)");
				char a = sc.next().charAt(0);
				if(a == 'y')
					System.out.println("Then I shall call you Mrs. " + fName + " " + lName);
				else
					System.out.println("Then I shall call you Ms. " + fName + " " + lName);
			}
		}
		
		else
		{
			if(age >= 20)
				System.out.println("Then I shall call you Mr. " + fName + " " + lName);
			else
				System.out.println("Then I shall call you " + fName + " " + lName);
		
		}
		
		

	}

}
