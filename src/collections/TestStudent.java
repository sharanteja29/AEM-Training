package collections;

import java.util.SortedSet;

import java.util.TreeSet;
 
public class TestStudent {
 
	public static void main(String[] args) {
		Student s1 = new Student(11, "Sagar", 86);
		Student s2 = new Student(22, "Ram", 98);
		Student s3 = new Student(44, "John", 77);
		SortByMarks sortByMarks = new SortByMarks();
		SortByRollNo sortByRollNo = new SortByRollNo();
		SortedSet studSet1 = new TreeSet(sortByMarks);
		studSet1.add(s3);
		studSet1.add(s1);
		studSet1.add(s2);
		System.out.println(studSet1);
		SortedSet studSet2 = new TreeSet(sortByRollNo);
		studSet2.add(s3);
		studSet2.add(s1);
		studSet2.add(s2);
		System.out.println(studSet2);
	}
 
 
}

 