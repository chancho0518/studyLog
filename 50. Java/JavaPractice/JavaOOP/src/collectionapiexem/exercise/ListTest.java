package collectionapiexem.exercise;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("orange");
		list.add("banana");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(list.size()-1));
		
		list.remove(0);
		list.set(1, "peach");
		
		for(String fruit : list) {
			System.out.println(fruit);
		}
		
		System.out.println(list.get(4));
	}
}
