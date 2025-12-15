package Activity5;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.sal > o2.sal) return 1;
		else if(o1.sal<o2.sal) return -1;
		return 0;
	}

}
