package Q1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter worked hour: ");
		Scanner input = new Scanner(System.in);
		double hour = input.nextInt();
		
		if (hour <= 35) {
			System.out.print("Amount of the salary to be paid: "+(hour*10));
		}
		else {
			hour = (hour-35)*16+220;
			System.out.print("Amount of the salary to be paid: "+(hour));
		}
	}

}
