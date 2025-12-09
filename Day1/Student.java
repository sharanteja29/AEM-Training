public class Student extends Person {
 
	// instance variable allocate memory after object creation
	int rollNumber;
	// Class variable allocate memory before object creation
	static String schoolName;
	// static block execute before object creation
	static {
		schoolName = "IIT-Mumbai";
		System.out.println("static block");
	}
	// Static Method
	static void printSchool() {
		System.out.println("SchoolName : "+schoolName);
	}
 
	// Default Constructor invoke after object creation
	public Student() {
		super(); //calling super class constructor
		rollNumber = 11;
		System.out.println("Student()");
	}	
	// Constructor with Parameter invoke after object creation
	public Student(String name, int rollNumber, String address) {
		super(name,address);//calling super class constructor		
		this.rollNumber = rollNumber;	
		System.out.println("Student(-,-,-)");
	}
 
	// will call while printing object
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", address=" + address + "]";
	}

 
 
}