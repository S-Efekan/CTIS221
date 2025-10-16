import java.util.Scanner;


public class HouseProjectMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice;
		
		System.out.println("Do you want to add Housing Project (Yes/No):");
		choice=input.next();
		
		while (!(choice.equalsIgnoreCase("Yes")||choice.equalsIgnoreCase("No"))) {
			
			System.out.println("Enter a valid input!");
			System.out.println("Do you want to add Housing Project (Yes/No):");
			choice=input.next();
		}
		
		while (!choice.equalsIgnoreCase("No")) {
		HousingProject house = new HousingProject();
		
		house.getInput();
		house.getHousePlan();
		house.discount();
		
		System.out.println("Do you want to add Housing Project (Yes/No):");
		choice=input.next();
		}
	}

}
