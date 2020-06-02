import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number between 0 to 1000");
		int a=sc.nextInt();
		int b=a%10;
		a=a/10;
		b=b+(a%10);
		a=a/10;
		b=b+(a%10);
		System.out.println("the sum of all digit in the number is " + b);
	
	}

}

