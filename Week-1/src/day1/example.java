package day1;

public class example {
	int age;
	String name;
	public example()
	{
		age = 12;
		name = "Teja";
		System.out.println("normal");
		
	}
	/*public void getdetails() {
		System.out.printf("The name of the person is %s and age is %d",name,age);
		
	}*/
	static String college;
	
	static {
		college="CMR";
		System.out.println("Static");
	}
	static void display()
	{
		System.out.println(college);
	}
	
	
	
	public example(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("parameterized");
	}
	@Override
	public String toString() {
		return "example [age=" + age + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		example obj  = new example();
	/*	System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.toString());
		//obj.getdetails();
		example obj2 = new example(22,"Sharan");
		System.out.println(obj2.toString());
		*/
		
		
		
	}

}
