
public class Question7 {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C;
		System.out.println("Original values");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		C = A;
		A = B;
		B = C;
		System.out.println("Swapped values");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}

}

