package Activity4;
public class TestEmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(1,"Teja",309);
		arr[1]= new Employee(2,"Mani",301);
		arr[2] = new Employee(3,"Sai",302);
		arr[3] = new Employee(4,"Sharan",307);
		arr[4] = new Employee(5,"Karan",305);
		Employee.getEmpDetails(1, arr);
				
	}

}
