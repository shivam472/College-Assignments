import java.util.Scanner;
public class question13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month no.: ");
		int m = sc.nextInt();
		
		System.out.println("Enter year: ");
		int y = sc.nextInt();
		
		switch(m)
		{
		case 1: System.out.println("No. of days = 31");
		break;
		case 3: System.out.println("No. of days = 31");
		break;
		case 4: System.out.println("No. of days = 30");
		break;
		case 5: System.out.println("No. of days = 31");
		break;
		case 6: System.out.println("No. of days = 30");
		break;
		case 7: System.out.println("No. of days = 31");
		break;
		case 8: System.out.println("No. of days = 31");
		break;
		case 9: System.out.println("No. of days = 30");
		break;
		case 10: System.out.println("No. of days = 31");
		break;
		case 11: System.out.println("No. of days = 30");
		break;
		case 12: System.out.println("No. of days = 31");
		break;
		}
		
		if(y % 4 == 0)
		{
			if(m == 2)
				System.out.println("No. of days = 29");
		}
		else if(y % 400 == 0)
		{
			if(m == 2)
				System.out.println("No. of days = 29");
		}
		else 
		{
			if(m == 2)	
				System.out.println("No. of days = 28");
		}
		
		}
		

	}


