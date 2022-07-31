package collections;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Matt");
		map1.put(2, "Katte");
		map1.put(3, "John");
		map1.put(4, "Kathy");
		map1.put(5, "Matt");
		map1.put(2, "Arpitha");
		map1.put(100, "Sachin");
	
		System.out.println("4th key " + map1.get(4));
		System.out.println("100th key " + map1.get(100));
		System.out.println(map1);
		map1.remove(100);
		System.out.println(map1);
		for(Integer key: map1.keySet()) 
		{
			System.out.println("Key is+" +  key);
			System.out.println("Value is "+   map1.get(key));
		}

	}
}
