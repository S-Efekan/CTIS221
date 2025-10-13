import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		System.out.printf("P. Play the number guessing game\nE. Exit game\nWhat is your choice?: ");
		
		Scanner input = new Scanner(System.in);
		
		String choice = input.next();
		
		while (!(choice.equalsIgnoreCase("p")) && !(choice.equalsIgnoreCase("e"))) {
			System.out.printf("\n");
			
			System.out.printf("P. Play the number guessing game\nE. Exit game\nWhat is your choice?: ");
			choice = input.next();
		}
		
		
		
		if (choice.equalsIgnoreCase("e")) {
			System.out.printf("See you next time!");
		}
		else {
			int randomNumber = (int)(Math.random()*10) +1;
			
			
			
			
			
			
			
		}
		input.close();
	}

}
