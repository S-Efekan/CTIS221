import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//paper is 1
		//rock is 2
		//scissor is 3
		Scanner input = new Scanner(System.in);
				
		System.out.print("Choose (p)aper, (r)ock, (s)cissor or (q)uit: ");
		String choice = input.next();
		
		while (!((choice.equalsIgnoreCase("p")) || (choice.equalsIgnoreCase("r")) || (choice.equalsIgnoreCase("s")) || (choice.equalsIgnoreCase("q")))) {
			System.out.println("Please enter apporpirate input!");
			System.out.print("Choose (p)aper, (r)ock, (s)cissor or (q)uit: ");
			choice = input.next();
		}
		
		int score = 0;

		
		if (choice.equalsIgnoreCase("q")) {
			System.out.println("See you next time!");
		}
		else {
			
			
			while ( !choice.equalsIgnoreCase("q")) {
				
				int random = (int) (Math.random() * 3)+ 1;
				System.out.print("\nThe machine chooses ");
				if ( random == 1) {
					System.out.print("paper.");
				}
				else if (random == 2) {
					System.out.print("rock.");
				}
				else
				{
					System.out.print("scissor.");
				}
				
				
				//KULLANICI PAPER SEÇERSE
				if (choice.equalsIgnoreCase("p")) {
					if (random == 1) {
						System.out.printf("It's a tie! Your score is %d.\n", score);
					}
					else if (random == 2) {
						score++;
						System.out.printf("Paper covers rock. You won! Your score is %d.\n", score);
					}
					else {
						score--;
						System.out.printf("Scissor cuts paper. You lost! Your score is %d.\n", score);
					}
				}
				
				
				//KULLANICI ROCK SEÇERSE
				else if (choice.equalsIgnoreCase("r"))
				{
					if (random == 1) {
						score--;
						System.out.printf("Paper covers rock. You lost! Your score is %d.\n", score);
					}
					else if (random == 2) {
						System.out.printf("It's a tie! Your score is %d.\n", score);
					}
					else {
						score++;
						System.out.printf("Rock breaks scissor. You won! Your score is %d.\n", score);
					}
				}
				
				//KULLANICI SCISSOR SEÇERSE
				else {
					if (random == 1) {
						score++;
						System.out.printf("Scissor cuts paper. You won! Your score is %d.\n", score);
					}
					else if (random == 2) {
						score--;
						System.out.printf("Rock breaks scissor. You lost! Your score is %d.\n", score);
					}
					else {
						System.out.printf("It's a tie! Your score is %d.\n", score);			
						}
			
				}
				
				
				System.out.print("Choose (p)aper, (r)ock, (s)cissor or (q)uit: ");
				choice = input.next();
				
				while (!((choice.equalsIgnoreCase("p")) || (choice.equalsIgnoreCase("r")) || (choice.equalsIgnoreCase("s")) || (choice.equalsIgnoreCase("q")))) {
					System.out.println("Please enter apporpirate input!");
					System.out.print("Choose (p)aper, (r)ock, (s)cissor or (q)uit: ");
					choice = input.next();
				}
				
				
				
				
			}
		}
		input.close();
	}

}
