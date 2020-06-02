
public class question16b {

	public static void main(String[] args) {
		
		int num; 
		for(int i = 0; i < 5; i++)
		{
			//initializing the initial number
			num = 1;
			for(int j = 0; j <= i; j++)
			{
				System.out.print(num + " ");
				
				//increasing the value of num
				num++;
			}
			System.out.println();
		}

	}
}
