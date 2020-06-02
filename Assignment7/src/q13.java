import java.util.Scanner;

public class q13 {

	public static boolean isSorted(int[] list) {
		
		int n = list.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(list[j] < list[i])
					return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list");
		int list[] = new int[8];
		for(int i = 0; i < 8; i++)
		{
			list[i] = sc.nextInt();
		}
		if(isSorted(list))
			System.out.println("The list is sorted");
		else
			System.out.println("The list is not sorted");	

	}

}
