package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("cherry");

		String fruitArray[] = new String[fruits.size()];

		System.out.println("Fruits -->  ArrayList to Array");
		for (int i = 0; i < fruits.size(); i++) {
			fruitArray[i] = fruits.get(i);
			System.out.println(fruitArray[i]);
		}
		System.out.println("Fruits -->  Array to ArrayList");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < fruitArray.length; i++) {

			list.add(fruitArray[i]);
			System.out.println(list.get(i));
		}

//		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
//
//		String[] fruitArray = fruits.toArray(new String[0]);
//
//		System.out.println("Array: " + Arrays.toString(fruitArray));
//		ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruitArray));
//
//		System.out.println("ArrayList: " + fruitList);
	}
}
