package stack;

import java.util.Stack;

public class HellolleH {

	public static void main(String[] args) {

		String input = "hello";

		Stack<Character> stack = new Stack<>();
		for (char letter : input.toCharArray())
			stack.push(letter);

		input = "";

		while (!stack.isEmpty()) {
			input += (stack.pop());
		}
		System.out.println(input);
	}

}
