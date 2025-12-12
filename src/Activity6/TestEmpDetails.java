package Activity6;


import java.util.HashMap;
import java.util.Scanner;

public class TestEmpDetails {
	public static void main(String[] args) {

		HashMap<Integer, Employee> map = new HashMap<>();

		map.put(5, new Employee(5, "Teja", 30000));
		map.put(2, new Employee(2, "Mani", 40000));
		map.put(3, new Employee(3, "Sai", 10000));
		map.put(4, new Employee(4, "Sharan", 90000));
		map.put(1, new Employee(1, "Karan", 60000));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Employee Id:");
		int n = sc.nextInt();
		try {
		    Employee.getEmpDetailsViaMap(n, map);
		} catch (EmpNotFoundException e) {
		    e.printStackTrace();
		}
		finally {
			System.out.println("Thank You Please Visit Again!!");
		}
	
	}

}
