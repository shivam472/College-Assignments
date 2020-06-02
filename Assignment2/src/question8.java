public class question8 {

	public static void main(String[] args) {
		double a=1 ,b=2,k;
		System.out.println("a    b    pow(a,b)");
		for (int i=0;i<5;i++)
		{
           k=Math.pow(a, b);
           System.out.println(a+ " "+b+"  "+k);
           a=a+1;
           b=b+1;
		}
	}

}

