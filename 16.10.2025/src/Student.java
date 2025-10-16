import java.util.Scanner;

public class Student {
	private String stuId, stuName, stuSurname,stuYear;
	private double tuition;
	
	
	public Student() {
		stuId="noID";
		stuName="NoName";
		stuSurname="NoSurname";
		stuYear="NoYear";
		tuition=0.0;
	}

	public Student(String stuId, String stuName, String stuSurname, String StuYear, double tuition) {
		this.stuId=stuId;
		this.stuName=stuName;
		this.stuSurname=stuSurname;
		this.stuYear=stuYear;
		this.tuition=tuition;
	}
	
	public String toString() {
		String output="";
		output += "\nStudent ID: "+stuId+"\nStudent Name: "+stuName+"\nStudent Surname: "+stuSurname+"\nYear: "+stuYear+"\nTuition: "+tuition;
		
		return output;
	}
	
	public void getInput(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter stu id: ");
		stuId=input.next();
		System.out.println("Enter stu name: ");
		input.skip("\\R");
		stuName=input.nextLine();
		System.out.println("Enter stu surname: ");
		stuSurname=input.next();
		
	}
}
