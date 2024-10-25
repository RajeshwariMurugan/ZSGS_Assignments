package linkedHashSet_Tree;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked3_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colors = new LinkedHashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("yello");

		System.out.println("Colors -->  LinkedHashSet to array");
		String[] colorArr = colors.toArray(new String[0]);

		System.out.println("Colors --> LinkedHashSet to Array:");
		for (String color : colorArr) {
			System.out.println(color);
		}
		System.out.println("Colors -->  Array  to LinkedHashSet");
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < colorArr.length; i++) {

			set.add(colorArr[i]);
			System.out.println(set);
		}
	}

}
