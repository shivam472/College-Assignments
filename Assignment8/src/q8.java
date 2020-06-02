
public class q8 {

	public static int pow(int x, int n)
	{
		if(n == 0)
			return 1;
		else
		{
			int p = x * pow(x,n-1);
			return p;
		}
	}
	public static void main(String[] args) {
		
		int power = pow(5,3);
		System.out.println(power);

	}

}
