import java.util.Scanner;

public class q12 {

	public static int countVowel(String str) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'A' || str.charAt(i) == 'a')
				count++;
			else if(str.charAt(i) == 'E' || str.charAt(i) == 'e')
				count++;
			else if(str.charAt(i) == 'I' || str.charAt(i) == 'i')
				count++;
			else if(str.charAt(i) == 'O' || str.charAt(i) == 'o')
				count++;
			else if(str.charAt(i) == 'U' || str.charAt(i) == 'u')
				count++;
		}
		return(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		int n = countVowel(str);
		System.out.println(n);

	}

}
