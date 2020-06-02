
public class Question8 {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 20;
		System.out.println("Original values");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("Swapped values");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}

}
