import java.util.Scanner;

public class RestaurantBillMain {

	public static void main(String[] args) {
		
		String choice = new String();
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Do you want to check the bill? (yes/no): ");
		choice = input.next();
		
		while (!(choice.equalsIgnoreCase("yes")||choice.equals("no"))){
			System.out.println("INVALID INPUT!");
			System.out.println("Do you want to check the bill? (yes/no): ");
			choice = input.next();
		}
		
		while(!(choice.equalsIgnoreCase("no"))) {
			
			RestaurantBill bill = new RestaurantBill();
			
			bill.getInput();
			bill.calculateBill();
			
			System.out.println(bill);
			
			
			System.out.println("Do you want to check the bill? (yes/no): ");
			choice = input.next();
			
			while (!(choice.equalsIgnoreCase("yes")||choice.equals("no"))){
				System.out.println("INVALID INPUT!");
				System.out.println("Do you want to check the bill? (yes/no): ");
				choice = input.next();
			
			}
		}
		System.out.println("There are "+RestaurantBill.getCountOfBills()+" bills.");

	}
}
