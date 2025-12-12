package day2;
import day1.Person;

public class TestArray {
	public static void main(String args[]) {
		Person studArr[] = new Person[3];
		// Array Object of type Person

		studArr[0] = new Person("Ram",11);
		studArr[1] = new Person("Sagar",22);
		studArr[2] = new Person("John",33);

		for(Person stud : studArr) {
		    System.out.println(stud);
		}

		
		
	}
	}


