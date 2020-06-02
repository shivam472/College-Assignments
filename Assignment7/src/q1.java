import java.util.Scanner;
public class q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int sum = 0;
		double avg = 0.0;
		
		int[] arr = new int[n];
		System.out.println("Array contents are: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = 1 + (int)(Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
		{
		sum = sum + arr[i];
		}
		avg = (double)(sum/arr.length);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
		
		
		
	}

}
