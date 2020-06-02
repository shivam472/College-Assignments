import java.util.Scanner;

public class q5 {
	public static int secMax(int[] arr) {
		int max = arr[0];
		int secMax = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				secMax = max;
				max = arr[i];
			}
				
		}
		return(secMax);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int m = secMax(arr);
		System.out.println("Second max value = " + m);
	}

}
