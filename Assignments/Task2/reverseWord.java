package Task2;

import java.util.Scanner;

/**
 10) Using Recursion, reverse the string such as
 
		Eg 1: Input: one two three
			   Output: three two one
			   
	    Eg 2: Input: I love india
			Output: india love I
 */
public class reverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input for reverse");
		String input = sc.nextLine();
		String result = reverseString(input);
		System.out.println("output : " + result);
	}

	public static String reverseString(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		int index = input.indexOf(' ');

		if (index == -1) {
			return input;
		} else {
			String substring = input.substring(index + 1);
			String reversed = reverseString(substring);

			return reversed + " " + input.substring(0, index);
		}

	}
}
