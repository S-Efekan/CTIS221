import java.util.Scanner;


public class Salesman {
	
	//Data Field
	private String name;
	private int workDay;
	private double salary;
	private int insuranceStartYear;
	private double retriementSalary;
	private static int salesmanCount = 0;
	
	
	Salesman (){
		salesmanCount++;
		name = null;
		workDay=0;
		salary=0;
		insuranceStartYear=0;
		retriementSalary=0;
	}
	
	public static int getSalesmanCount() {
		return salesmanCount;
	}
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter total worked day: ");
		workDay = input.nextInt();
		System.out.println("Enter salesmans' current salary: ");
		salary = input.nextDouble();
		System.out.println("Enter the insurance start year: ");
		insuranceStartYear=input.nextInt();
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getRetirementSalary () {
		return retriementSalary;
	}
	
	public int getWorkDay () {
		return workDay;
	}
	
	public int getInsuranceStartYear () {
		return insuranceStartYear;
	}
	
	public void setRetirementSalary (double salary) {
		this.salary=salary;
	}	
	
}
