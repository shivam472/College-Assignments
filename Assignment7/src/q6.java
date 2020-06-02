import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter how many elements you want to enter");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int b[] = new int[n];
		int j = arr.length;
		
		
		for(int i = 0; i < n; i++)
		{
			b[j -1] = arr[i];
			j = j - 1;
		}
		System.out.println("Reverse array: ");
		for(int k = 0; k < n; k++)
		{
			System.out.print(b[k] + " ");
		}
		

	}

}
