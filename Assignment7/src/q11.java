import java.util.Scanner;

public class q11 {
	
	public static int[] BubbleSort(int[] arr, int n)
	{
		int temp = 0;
		for(int i = 0; i < n; i++) 
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return(arr);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers");
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int[] B = BubbleSort(arr, arr.length);
		System.out.println("Sorted elements are:");
		for(int i = 0; i < B.length; i++)
		{
			System.out.print(B[i] + " ");
		}
		System.out.println();

	}

}
