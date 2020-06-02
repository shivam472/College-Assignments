
public class question23 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		System.out.println("Enter three integers: " + x + " " + y + " " + z);
		int min1 = Math.min(x, y);
		int min2 = Math.min(min1, z);
		int min3 = Math.max(y, x);
		int min4 = Math.max(min3, z);
		System.out.println("ascending order: " + min2 + " " + min3 + " " + min4);
		
		System.out.println("descending order: " + min4 + " " + min3 + " " + min2);
	}

}
