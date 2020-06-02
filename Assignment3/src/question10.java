import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int d = sc.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int e = sc.nextInt();
		
		switch(d)
		{
		case 0: System.out.println("Today is Sunday");
		break;
		case 1: System.out.println("Today is Monday");
		break;
		case 2: System.out.println("Today is Tuesday");
		break;
		case 3: System.out.println("Today is Wednesday");
		break;
		case 4: System.out.println("Today is Thursday");
		break;
		case 5: System.out.println("Today is Friday");
		break;
		case 6: System.out.println("Today is Saturday");
		break;
		default: System.out.println("Not valid");
		}
		
		int futureDay = (d + e) % 7;
		if(futureDay == 0)
			System.out.println("Future day is Sunday");
		
		else if(futureDay == 1)
			System.out.println("Future day is Monday"); 
		
		else if(futureDay == 2)
			System.out.println("Future day is Tuesday");
		
		else if(futureDay == 3)
			System.out.println("Future day is Wednesday");
		
		else if(futureDay == 4)
			System.out.println("Future day is Thursday");
		
		else if(futureDay == 5)
			System.out.println("Future day is Friday");
		
		else 
			System.out.println("Future day is Saturday");
		
			
			
	}

}
