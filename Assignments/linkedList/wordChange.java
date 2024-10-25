package linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class wordChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("three");
		System.out.println(list);
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals("three")) {
				iterator.set("THREE");
			}
		}
		System.out.println(list);

	}

}
