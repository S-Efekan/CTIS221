import java.util.Scanner;
public class MainAntique {

	
	public static double calculatePrice(int year, String dmg) {
		double price = 0.0;
		int persentage = 1;
		
		if (year < 17) {
			price = 185000;
			if(dmg.equalsIgnoreCase("High")) {
				persentage = 70;
			}
			else if(dmg.equalsIgnoreCase("Medium")) {
				persentage = 40;
			}
		}
		else {
			price = 155000;
			if(dmg.equalsIgnoreCase("High")) {
				persentage = 20;
			}
			else if(dmg.equalsIgnoreCase("Medium")) {
				persentage = 40;
			}
		}
		
		
		return price * (100-persentage) / 100;
	}
	
	
	public static void main(String[] args) {
		
		String choice = new String();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to check the antiques' price (yes/no): ");
		choice = input.next();
		
		while (!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
			System.out.println("ENTER VALID CHOICE!");
			System.out.println("Do you want to check the antiques' price (yes/no): ");
			choice = input.next();
		}
		
		while(!choice.equalsIgnoreCase("no")) {
			
			Antique item = new Antique();
			
			item.getInput();
			item.setPrice(calculatePrice(item.getCentury(),item.getDamageDegree()));
			System.out.println("The antique's price is: "+item.getPrice()+"$.\n");
			
			
			System.out.println("Do you want to check the antiques' price (yes/no): ");
			choice = input.next();
			
			
			while (!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
				System.out.println("ENTER VALID CHOICE!");
				System.out.println("Do you want to check the antiques' price (yes/no): ");
				choice = input.next();
			}
			
		}
		System.out.println("\n\nThere are "+Antique.getCountOfAntiques()+" antiques.");
	}

}
