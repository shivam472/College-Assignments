import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a character ");
		char c = sc.next().charAt(0);  //for taking character input from keyboard we use sc.next() or sc.nextline()
		if(c >= 65 &&  c <= 90)
		{
			System.out.println("Capital alphabet");
		}
		else if(c >= 97 && c <= 122)
		{
			System.out.println("Small alphabet");
		}
		else if(c >= 48 && c<=57)
		{
			System.out.println("a number between 0-9");
		}
		else 
			System.out.println("Special character");
		

	}

}
