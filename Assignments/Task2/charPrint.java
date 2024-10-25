package Task2;

import java.util.Scanner;

public class charPrint {
/**
   11) Write a program to give the following output for the given input:
			Eg 1: Input: a1b10
				  Output: abbbbbbbbbb
				  
			Eg: 2: Input: b3c6d15
				   Output: bbbccccccddddddddddddddd
				   
The number varies from 1 to 99.
 */
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the input string: ");
	String input = scanner.nextLine();

	String result = "";

	for (int i = 0; i < input.length(); i++) {
		char currentChar = input.charAt(i);

		i++;
		String number = "";

		while (i < input.length() && Character.isDigit(input.charAt(i))) {
			number += input.charAt(i);
			i++;
		}

		i--;

		int count = Integer.parseInt(number);

		for (int j = 0; j < count; j++) {
			result += currentChar;
		}
	}

	System.out.println("Output: " + result);

}

}
