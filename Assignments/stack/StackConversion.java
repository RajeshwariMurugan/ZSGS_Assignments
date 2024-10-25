package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> values = new Stack<>();
		values.push(1.1);
		values.push(2.2);
		values.push(3.3);
		values.push(4.4);
		values.push(5.5);

		Double fruit[] = new Double[values.size()];

		System.out.println("values -->  Stack to array ");
		for (int i = values.size() - 1; i >= 0; i--) {
			fruit[i] = values.pop();

		}
		System.out.println(Arrays.toString(fruit));
		System.out.println("values -->  array to Stack");
		Stack<Double> list = new Stack<>();
		for (int i = 0; i < fruit.length; i++) {

			list.push(fruit[i]);
			System.out.println(list.pop());
		}

	}

}
