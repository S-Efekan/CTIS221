
public class RadioMain_b {

	public static void main(String[] args) {
		Radio r1 = new Radio();
		Radio r2 = new Radio("Power FM", "Pop", 104.8);
		Radio r3 = new Radio("NRK", "Jazz", 82.5);
		Radio r4 = new Radio("Joy FM", "Pop", 75.8);
		 
		
		
		System.out.println("Name: " + r1.name);
		System.out.println("Frequency: " + r1.frequency);
		System.out.println("Type: " + r1.type);
		
		System.out.println("Name: " + r2.name);
		System.out.println("Frequency: " + r2.frequency);
		System.out.println("Type: " + r2.type);
		
		System.out.println("Name: " + r3.name);
		System.out.println("Frequency: " + r3.frequency);
		System.out.println("Type: " + r3.type);
		
		System.out.println("Name: " + r4.name);
		System.out.println("Frequency: " + r4.frequency);
		System.out.println("Type: " + r4.type);
			
	}

}
