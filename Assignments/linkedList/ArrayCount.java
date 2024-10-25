package linkedList;

import java.util.LinkedList;
import java.util.List;

public class ArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 10; i++)
			list.add(i);

		System.out.println(list);
		list.remove(2);
		list.removeLast();
		System.out.println(list);

	}

}
