package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class ListDemo {
 
	public static void main(String[] args) {
		//	int arr[];
		List list = new ArrayList();
 
		list.add(23);
		list.add("www");
		list.add(45.7);
		list.add("www");
		list.add(2, 3354);
 
		System.out.println(list);
 
		list.remove(1);
		System.out.println(list);
		System.out.println("list.contains(3354) "+list.contains(3354));
		System.out.println("list.get(3) "+list.get(3));
 
		Iterator itr = list.iterator();
 
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
 
	}
 
}
