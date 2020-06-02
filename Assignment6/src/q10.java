import java.util.Scanner;
public class q10 {
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		int count = 0;
		for(char ch = (char)(ch1+1); ch < ch2; ch++)
		{
			System.out.print(ch + " ");
			count++;
			if(count % numberPerLine == 0)
				System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two chracters between which you want to print all the characters between them");
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		System.out.println("Enter no. per line ");
		int x = sc.nextInt();
		printChars(ch1, ch2, x);
		
		
	}
}
