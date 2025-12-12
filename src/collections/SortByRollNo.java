package collections;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student>
{
 
	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("SortByRollNo ");
		if(o1.rollNo < o2.rollNo )
			return 1;
		else if(o1.rollNo > o2.rollNo )
			return -1;
		return 0;
	}
}