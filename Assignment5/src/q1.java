import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a no.: ");
	int N = sc.nextInt();
	for(int i=0; i<=N; i++)
	{
		int pow = (int)(Math.pow(2, i));
		System.out.println(i + " " + pow);
	}
	

	}

}
