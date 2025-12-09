
 public class Person {
 
	String name;

	String address;

	public Person() {

		name = "Sagar";

		address = "Pune";

	}
 
	public Person(String name, String address) {

		super();

		this.name = name;

		this.address = address;

	}
 
	@Override

	public String toString() {

		return "Person [name=" + name + ", address=" + address + "]";

	}



}

 