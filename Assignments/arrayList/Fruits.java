package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Grapes");
		fruits.add("Banana");

		for (String ans : fruits)
			System.out.println(ans);
		System.out.println("Fruits " + fruits.get(2));

	}

}
