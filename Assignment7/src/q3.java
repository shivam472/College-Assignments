import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 10 numbers");
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the digit you want to search");
		int x = sc.nextInt();
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == x)
				count++;
		}
		System.out.println(x + " appears " + count + " times");

	}

}
