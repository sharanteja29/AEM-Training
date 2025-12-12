package Activity6;

//import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
	int empid;
	String name;
	int sal;
	public Employee(int empid, String name, int sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee() {
		super();
	}

	/*static void getEmpDetails(int empid,ArrayList<Employee> arr)
	{
	try {
		int status=0;
		for(Employee e : arr) {
			if(empid == e.empid) {
				System.out.println("Employee Found");
				System.out.println("The Employee Name is " + e.name + " his salary is "+ e.sal);
				status=1;
				break;
			}
		}
	if(status==0) {
		throw new EmpNotFindException();
	}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		System.out.println("Thank You Please Visit Again!!");
	}
	}*/
	public static void getEmpDetailsViaMap(int empid, HashMap<Integer,Employee> map) {
	    Employee e = map.get(empid);

	    if (e == null) {
	        throw new EmpNotFoundException();
	    }
	    System.out.println("Employee is Found");
	    System.out.println("The Employee ID is "+ e.empid + ", his Name is " + e.name + ", his Salary is " + e.sal);
	}
}
