import java.util.Scanner;


public class RestaurantBill {
	private int tableNo;
	private String menuItem;
	private double size;
	private double price;
	private static int countOfBills=0;
	private static double CHICKEN = 350;
	private static double BEEF = 540;


	RestaurantBill(){
		tableNo=0;
		menuItem=null;
		size=0;
		price=0;
		countOfBills++;
	}
	
	public static int getCountOfBills() {
		return countOfBills;
	}

	public double getPrice() {
		return price;
	}
	
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the table number: ");
		tableNo=input.nextInt();
		input.skip("\\R");
		System.out.println("Enter the menu item's name: ");
		menuItem=input.nextLine();
		System.out.println("Enter the size in grams: ");
		size=input.nextDouble();
		
		
	}
	
	public void calculateBill () {
		
		
		if (menuItem.equalsIgnoreCase("chicken wrap")) {
			price = CHICKEN;
			if (size == 120) {
				price = price + CHICKEN*40/100;
			}
			else if (size == 180) {
				price = price + CHICKEN*70/100;
			}
		}
		else {
			price = BEEF;
			if(size == 120) {
				price = price + BEEF*40/100;
			}
			else if (size == 180) {
				price = price + BEEF*80/100;
			}
		}
		
	}
	
	public String toString(){
		String output = new String();
		
		output = "The Bill is "+price+" TL";
		
		return output;
	}
	
	

}

