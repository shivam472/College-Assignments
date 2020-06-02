
public class question11 {

	public static void main(String[] args) {
		
		int sum1 = 0, sum2 = 0;
		int diff;
		for (int i = 1; i <= 100; i++)
		{
			sum1 = sum1 + (i*i);
		}
		System.out.println("The sum of the squares of the first one hundred natural numbers is = " + sum1);
		
		for (int j = 1; j <= 100; j++)
		{
			sum2 = sum2 + j;
		}
		sum2 = sum2 * sum2;
		System.out.println("The square of the sum of the first ten natural numbers is = " + sum2);
		
		diff = sum2 - sum1;
		System.out.print("Hence the difference between the sum of the squares of the first hundred natural numbers and the square of the sum is = " + diff);
	}

}
