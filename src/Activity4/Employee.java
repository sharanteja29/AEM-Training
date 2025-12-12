package Activity4;

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

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	static void getEmpDetails(int empid,Employee emp[])
	{
		int status=0;
		for(int i=0;i<5;i++) {
			if(empid == emp[i].empid) {
				System.out.println(emp[i].toString());
				status=1;
				break;
			}
		}
			if(status==0) {
			try {
				throw new EmpNotFindException();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		}
	}
