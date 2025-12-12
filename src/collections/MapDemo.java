package collections;

import java.util.HashMap;
import java.util.Map;
 
public class MapDemo {
 
	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, 234);

		map.put(2, 454.6);

		map.put(3, "www");

		map.put(4, "www");

		System.out.println(map);

		map.put(4, "Sagar");

		System.out.println(map);

		System.out.println("map.containsKey(3) "+map.containsKey(3));

		System.out.println("map.containsValue(\"Sagar\") "+map.containsValue("Sagar"));

		System.out.println("map.isEmpty() "+map.isEmpty());

		System.out.println("map.keySet() "+map.keySet());

		map.putIfAbsent(5, "Acc");

		System.out.println("map.putIfAbsent(5, \"Acc\") "+map);

		map.remove(2);

		System.out.println("map.remove(2) "+map);

		map.replace(5, "Acc", "Accenture");

		System.out.println("map.replace(5, \"Acc\", \"Accenture\") "+map);

	}
 
}

 