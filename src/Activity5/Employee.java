package Activity5;

public class Employee implements Comparable<Employee> {
int eid;
String name;
int sal;
public Employee(int eid, String name, int sal) {
	super();
	this.eid = eid;
	this.name = name;
	this.sal = sal;
}
@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
	if (this.eid > o.eid) return 1;
	else if (this.eid < o.eid) return -1;
	else return 0;
	}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]\n";
}

}