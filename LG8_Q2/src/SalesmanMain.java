import java.util.Scanner;


public class SalesmanMain {
	
	
	
	
	public static double calculateRetirementSalary(int insuranceStartYear, int workedDays, double salary) {
		
		double retSal =0;
		
		if(insuranceStartYear<2000) {
			retSal = (12 * salary / 1000) * 1200 * 0.06;
		}
		else {
			retSal = (12 * salary / (workedDays/360)) * 120 * 0.01;
		}
		
		
		return retSal;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = new String();
		
		
		System.out.println("Do you want to check the retirement salary for a salesman (yes/no): ");
		choice = input.next();
		
		
		while(!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
			System.out.println("Enter valid input!");
			System.out.println("Do you want to check the retirement salary for a salesman (yes/no): ");
			choice = input.next();
		}
		
		
		while (!choice.equalsIgnoreCase("no")) {
			
			Salesman person = new Salesman();
			
			person.getInput();
			
			
			//before 1980 5000 work days required for retirement.
			//after 1980 7200 work days required.
			
			if (person.getInsuranceStartYear()<1980) {
				if(person.getWorkDay()>5000) {
					System.out.println("You can retire!!");
				}
				else {
					System.out.println("You should work "+(5000-person.getWorkDay())+" days more to retire.");
				}
			}
			else {
				if(person.getWorkDay()>7200) {
					System.out.println("You can retire!!");
				}
				else {
					System.out.println("You should work "+(7200-person.getWorkDay())+" days more to retire.");
				}
			
			}
		
		double sal = calculateRetirementSalary(person.getInsuranceStartYear(), person.getWorkDay(),person.getSalary());
		
		System.out.println("If you retire, you'll be paid "+sal+"$ per month.");
		
		
		System.out.println("Do you want to check the retirement salary for a salesman (yes/no): ");
		choice = input.next();
		
		
		while(!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
			System.out.println("Enter valid input!");
			System.out.println("Do you want to check the retirement salary for a salesman (yes/no): ");
			choice = input.next();
		
		}		
		}
		System.out.println("There are "+Salesman.getSalesmanCount()+" salesmans.");

	}
}		
