package linkedHashSet_Tree;

import java.util.TreeSet;

public class Tree3 {
	public static void main(String[] args) {

		TreeSet<Double> treeSet = new TreeSet<>();
		treeSet.add(1.1);
		treeSet.add(2.2);
		treeSet.add(3.3);
		treeSet.add(4.4);
		treeSet.add(5.5);

		System.out.println("First element: " + treeSet.first());

		System.out.println("Last element: " + treeSet.last());

		System.out.println("Element higher than 3.3: " + treeSet.higher(3.3));

		System.out.println("Element lower than 3.3: " + treeSet.lower(3.3));
	}
}
