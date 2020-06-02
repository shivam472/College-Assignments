import java.util.Scanner;
public class q14 {
	
	public static void passwordCheck(String pass)
	{
		int passLength = pass.length();
		int count = 0;
		
		for(int i = 0; i < pass.length(); i++)
		{
			if(pass.charAt(i) > 47 && pass.charAt(i) < 58)
				count++;
			if(count > 2) 
				count = 0;
			if(passLength < 8)
				count = 0;
			else if(pass.charAt(i) < 48)
				count = 0;
			else if(pass.charAt(i) > 57 && pass.charAt(i) < 64)
				count = 0;
			else if(pass.charAt(i) > 90 && pass.charAt(i) < 96)
				count = 0;
			else if(pass.charAt(i) > 122) 
				count = 0;
		}
		
		if(count != 0 && count <= 2)
			System.out.println("Valid Password");
		else 
			System.out.println("Password Not Valid");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String pass = sc.next();
		passwordCheck(pass);
		
	}

}
