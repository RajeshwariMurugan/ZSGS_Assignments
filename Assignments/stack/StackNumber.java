package stack;

import java.util.Stack;

public class StackNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> values = new Stack<>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		System.out.println(values);

		System.out.println(values.pop());
		System.out.println(values);

	}

}
