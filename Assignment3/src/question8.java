import java.util.Scanner;
public class question8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Rahul, Ayush, Ajay: ");
		int ageRahul = sc.nextInt();
		int ageAyush = sc.nextInt();
		int ageAjay = sc.nextInt();
		int elder = Math.max(Math.max(ageRahul, ageAyush), ageAjay);
		if (elder == ageRahul)
			System.out.println("elder among them is Rahul");
		
		else if (elder == ageAyush)
			System.out.println("elder among them is Ayush");
		
		else 
			System.out.println("elder among them is Ajay");
		
		
	}

}
