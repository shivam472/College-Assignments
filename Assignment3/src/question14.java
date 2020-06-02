import java.util.Scanner;

public class question14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("choose: scissor (0), rock (1), paper (2): ");
		int input = in.nextInt();
		int randNum = (int) (Math.random() * 2);
		
		if(randNum == 0)
		{
			if(input == 1)
				System.out.println("The computer is scissor. You are rock. You won");
			else if(input == 2)
				System.out.println("The computer is scissor. You are paper. You lose");
			else 
				System.out.println("The computer is scissor. You are scissor. it's a draw");
		}
				
		else if(randNum == 1)
		{
			if(input == 0)
				System.out.println("The computer is rock. You are scissor. You lose");
			else if(input == 2)
				System.out.println("The computer is rock. You are paper. You win");
			else 
				System.out.println("The computer is rock. You are rock. it's a draw");
		}
		else 
		{
			if(input == 0)
				System.out.println("The computer is paper. You are scissor. You win");
			else if(input == 2)
				System.out.println("The computer is paper. You are rock. You lose");
			else 
				System.out.println("The computer is paper. You are paper. it's a draw");
		}
		
		
		
	}

}
