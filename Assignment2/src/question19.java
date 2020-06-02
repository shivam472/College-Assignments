
public class question19 {

	public static void main(String[] args) {
		
		int BS = Integer.parseInt(args[0]);
		int DA = (int) (0.4 * BS) ;
		int HRA = (int)  (0.2 * BS);
		System.out.println("Enter the basic salary: " + BS);
		System.out.println("Dearness Allowance = " + DA);
		System.out.println("House Rent Allowance = " + HRA);
	
		int GS = BS - (DA + HRA);
		
		System.out.println("Gross salary = " + GS);
		
		

	}

}
