package linkedList;

import java.util.LinkedList;
import java.util.List;

public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println(list.get(0)+"  "+list.get(list.size()-1));
		System.out.println(list.getFirst()+"  "+list.getLast());

	}

}
