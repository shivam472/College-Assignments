
public class q4 {
	
	public static int numberOfDaysInAYear(int year) {
		if(year % 4 == 0)
			return 1;
		
		if(year % 100 == 0)
		{
			if(year % 400 == 0)
				return 1;
			else 
				return 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		 for(int i = 2000; i <= 2020; i++)
		 {
			int NOD = numberOfDaysInAYear(i);
			if(NOD == 1)
				System.out.println("No. of days in the year " + i + " = " + 366);
			else
				System.out.println("No. of days in the year " + i + " = " + 365);
		 }

	}

}
