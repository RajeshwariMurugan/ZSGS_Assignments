package linkedHashSet_Tree;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked1_BasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new LinkedHashSet<>();

		set.add(5);
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(25);
		
		System.out.println(set);
	
		set.add(15);
		set.add(20);
		
		System.out.println(set);
	}

}
