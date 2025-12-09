public class Employee extends Person {
 
	
	int eid,salary;
	String position;
	public Employee() {
		super();
		eid = 101;
		position = "TL";
		salary = 25000;
		}
 
	public Employee(String name, String address, int eid, int salary, String position) {
		super(name, address);
		this.eid = eid;
		this.salary = salary;
		this.position = position;
	}
 
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", position=" + position + ", name=" + name
				+ ", address=" + address + "]";
	}


}