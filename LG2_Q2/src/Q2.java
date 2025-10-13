import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		System.out.println("H. Hardcover");
		System.out.println("P. Paperback");
		System.out.println("E. EBook");
		System.out.print("Enter the type of book (H/h: Hardcover, P/p: Paperback, E/e: EBook: ");
		
		Scanner input = new Scanner(System.in);
		String booktype = input.next();
		
		while (!(booktype.equalsIgnoreCase("h")) && !(booktype.equalsIgnoreCase("p")) && !(booktype.equalsIgnoreCase("e"))) {
			
			System.out.println("H. Hardcover");
			System.out.println("P. Paperback");
			System.out.println("E. EBook");
			System.out.print("Enter the type of book (H/h: Hardcover, P/p: Paperback, E/e: EBook: ");
			
			booktype = input.next();
			
		}
		//Paperback  8%
		//Hardcover 12%
		//EBook 	 5%
		
		double vat;
		
		if (booktype.equalsIgnoreCase("h")) {
			vat = 0.12;
		}
		else if (booktype.equalsIgnoreCase("p")) {
			vat = 0.08;
		}
		else {
			vat = 0.05;
		}
			
		
		
		
		System.out.print("\nHow many books do you want to enter: ");
		int numberOfBooks = input.nextInt();
		
		double totalCost = 0;
		double bookCost;
		
		
		
		for (int i = 1; i < numberOfBooks; i++) {
			System.out.print("Enter "+ (i+1) +". item's cost in TL: ");
			bookCost = input.nextDouble();
			totalCost += bookCost;
		}
		
		
		double totalVAT = totalCost * vat;
		
		System.out.printf("\nTotal cost: %.2f TL\n", totalCost);
		System.out.printf("Total VAT: %.2f TL", totalVAT);
		
		
	input.close();	
	}
}
