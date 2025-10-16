import java.util.Scanner;

public class HousingProject {
	private String brand;
	private String city;
	private double price;
	private int numberOfPayment;
	private String HousingPlan;
	
	
	
	public HousingProject() {
		brand=null;
		city=null;
		price=0.0;
		numberOfPayment=0;
		HousingPlan=null;
	}
	
	public HousingProject(String brand, String city, double price, int numberOfPayment, String HousingPlan) {
		this.brand=brand;
		this.city=city;
		this.price=price;
		this.numberOfPayment=numberOfPayment;
		this.HousingPlan=HousingPlan;
	}
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the brand: ");
		brand=input.next();
		System.out.println("Enter the city: ");
		city=input.next();
		System.out.println("Enter the price: ");
		price=input.nextDouble();
		System.out.println("Enter the number of payments: ");
		numberOfPayment=input.nextInt();
		System.out.println("Enter the house plan: ");
		HousingPlan=input.next();
		
		input.close();
	}
	
	public void discount() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the discount persentage: ");
		int disc = input.nextInt();
		
		
		
	}
	
	
	
	
}
