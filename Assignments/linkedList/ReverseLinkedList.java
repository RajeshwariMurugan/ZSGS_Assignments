package linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> list = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('F');

		System.out.println(list);
		LinkedList<Character> reversedList = new LinkedList<>();
		ListIterator<Character> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			reversedList.add(iterator.previous());
		}

		System.out.println(reversedList);
	}

}
