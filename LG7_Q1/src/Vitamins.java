
public class Vitamins {

	
	private String name;
	private int numberOfCapsul;
	private String brand;
	private int codeNumber;
	
	public Vitamins() {
		name="NoName";
		numberOfCapsul=0;
		brand="NoBrand";
		codeNumber=0;
	}
	
	public Vitamins(String name, int numberOfCapsul, String brand, int codeNumber) {
		this.name=name;
		this.numberOfCapsul=numberOfCapsul;
		this.brand=brand;
		this.codeNumber=codeNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setNumberOfCapsul (int num) {
		numberOfCapsul=num;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setCodeNumber(int num) {
		codeNumber=num;
	}
	
	
	public String toString() {
		
		String display = new String();
		
		
		display = "Vitamin Info:\n\nName= "+name+"\nNumOfCapsul= "+numberOfCapsul+"\nBrand= "+brand+"\nCodeNumber= "+codeNumber;
		
		return display;
	}
	
}
