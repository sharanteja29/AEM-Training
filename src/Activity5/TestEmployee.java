package Activity5;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestEmployee {
	public static void main(String[] args) {
		Employee obj1 = new Employee(1,"Sharan",30000);
		Employee obj2 = new Employee(6,"karan",70000);
		Employee obj3 = new Employee(8,"Sai",20000);
		Employee obj4 = new Employee(10,"Teja",10000);
		Employee obj5 = new Employee(3,"Mani",50000);
		SortedSet tree = new TreeSet();
		tree.add(obj1);
		tree.add(obj2);
		tree.add(obj3);
		tree.add(obj4);
		tree.add(obj5);
		
		System.out.println(tree.toString());
		System.out.println("Sort By Salary");
		SortBySalary obj = new SortBySalary();
		SortedSet tree1 = new TreeSet(obj);
		tree1.add(obj1);
		tree1.add(obj2);
		tree1.add(obj3);
		tree1.add(obj4);
		tree1.add(obj5);
		System.out.println(tree1.toString());
		
	}

}
