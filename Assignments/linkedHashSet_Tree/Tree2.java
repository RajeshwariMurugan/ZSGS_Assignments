package linkedHashSet_Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree2 {
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});

		
		treeSet.add("banana");
		treeSet.add("apple");
		treeSet.add("cherry");
		treeSet.add("date");

	
		System.out.println("TreeSet elements (ordered by length): " + treeSet);
	}
}
