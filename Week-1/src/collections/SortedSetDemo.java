package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
 
public class SortedSetDemo {
 
	public static void main(String[] args) {
 
		SortedSet sortSet = new TreeSet();
 
		sortSet.add(12);
		sortSet.add(2);
		sortSet.add(111);
		sortSet.add(45);
 
		System.out.println(sortSet);
		System.out.println("set.contains(45) : "+sortSet.contains(45));
 
		sortSet.remove(45);
 
		System.out.println(sortSet);
 
		Iterator itr = sortSet.iterator();
 
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
 
	}
 
}