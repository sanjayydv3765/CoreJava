package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] array1 = { "abc", "def", "rat" };
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("John");
		list1.add("Leeana");
		list1.add("sanjay");
		list1.add("Rahul");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("List is this" + list1);
		System.out.println("Size of arraylist " + list1.size());

		list1.remove(2);
		System.out.println("List after deleting " + list1);
		System.out.println("Size of arraylist " + list1.size());

		System.out.println("The data at 3 position " + list1.get(2));
		list1.set(2, "James");
		System.out.println("New updated list is " + list1);

		list1.add(0, "Rinky");
		System.out.println("New List after adding Rinky " + list1);

		Collections.sort(list1);
		System.out.println("List after sorting" + list1);

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == "Rinky")
				System.out.println(list1.get(i));
		}
		for (String name : list1) {
			System.out.println(name);
		}
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == "James") {
				System.out.println("Value is at" + i);
				break;
			}
			
			
		}
		for (int i=0; i<list1.size(); i++) {
			if(list1.get(i).equals("Rinky")) {
				System.out.println(i);
			}
		}
		System.out.println("Value is at");
	}
}
