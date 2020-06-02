import java.util.Scanner;
public class q12 {
	
	public static int[] SelectionSort(int[] A, int n)
	{
		int i = 0, j = 0;
		int temp = 0;
		for(i = 0; i < n-1; i++)
		{
			int min = i;
			for(j = i+1; j < n; j++)
			{
				if(A[j] < A[min])
					min = j;	
			}
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;	
		}
		return(A);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers");
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int[] B = SelectionSort(arr, arr.length);
		System.out.println("Sorted elements are");
		for(int i = 0; i < B.length; i++)
		{
			System.out.print(B[i] + " ");
		}
		System.out.println();
		
	}

}
