import java.util.Scanner;

public class Antique {
	private String name;
	private int century;
	private double price;
	private String damageDegree;
	private static int countOfAntiques=0;
	
	
	
	Antique(){
		countOfAntiques++;
		name=null;
		damageDegree=null;
		century=0;
		price=0.0;
	}
	
	public static int getCountOfAntiques() {
		return countOfAntiques;
	}
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the antique's name: ");
		name = input.nextLine();
		System.out.println("Enter century: ");
		century = input.nextInt();
		System.out.println("Enter the damage degree (High/Medium/Low): ");
		damageDegree = input.next();
	}
	
	
	public int getCentury() {
		return century;
	}
	
	public String getDamageDegree () {
		return damageDegree;
	}
	
	public double getPrice () {
		return price;
	}
	
	public void setPrice (double price) {
		this.price=price;
	}
	
	
}
