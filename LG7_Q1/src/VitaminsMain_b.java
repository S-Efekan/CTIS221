import java.util.Scanner;

public class VitaminsMain_b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Vitamins v1 = new Vitamins();
		
		System.out.println("Enter Name: ");
		v1.setName(input.next());
		System.out.println("Enter Brand Name: ");
		v1.setBrand(input.next());
		System.out.println("Enter the Number of Capsules: ");
		v1.setNumberOfCapsul(input.nextInt());
		System.out.println("Enter the Code Number: ");
		v1.setCodeNumber(input.nextInt());
		
		System.out.println(v1);
		
	}

}
