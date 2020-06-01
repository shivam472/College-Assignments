import java.util.Scanner;   //To take input we need to import scanner class

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   //Then we create an object of Scanner class which will be used to get input from the user
		System.out.println("Enter Reg. No. ");
		int number = input.nextInt();    //Here 'input' object of Scanner class is created. Then the nextint() method of the Scanner class is used to get integer input from the user.
		System.out.println("Year of Admission ");
		int YearOf = input.nextInt();
		System.out.println("My red.No is " + number + " and I have taken admission in B.Tech. in " + YearOf);
		

	}
//To get long, float, double, and String input from the user, you can use nextLong(), nextFloat(), nextDouble(), and next() methods respectively.
}
