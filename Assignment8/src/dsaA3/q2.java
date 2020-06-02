package dsaA3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] favCol = {"Red", "Green", "Black", "Blue"};
		try
		{
			System.out.println("enter the index no. to select the color: ");
			int i = sc.nextInt();
			if(i < 0)
				throw new ArrayIndexOutOfBoundsException("Please enter a valid index no.");
			else if(i >= favCol.length)
				throw new ArrayIndexOutOfBoundsException("Please enter a valid index no.");
			else
				System.out.println(favCol);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
