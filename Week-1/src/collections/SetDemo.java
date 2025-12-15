package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class SetDemo {
 
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(10);
		set.add(30);
		set.add(1.5);
		set.add("www");
		set.add("www");
		System.out.println(set);
		System.out.println("set.contains(30) : "+set.contains(30));
		set.remove(30);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
 
}
