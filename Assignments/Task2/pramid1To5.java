/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
25) Write a program to print the following output for the given input. You can assume
the string is of odd length

	Eg 1: Input: 12345
	  Output:
				1    5
				 2  4
				   3
				 2  4
				1     5
 */
public class pramid1To5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input: ");

		String word = sc.nextLine();

		int wordLength = word.length();

		for (int i = 0; i < wordLength; i++) {

			for (int j = 0; j < wordLength; j++) {

				if (i == j) {

					System.out.print(word.charAt(i) + " ");

				} else if (j == wordLength - i - 1) {

					System.out.print(word.charAt(j) + " ");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}

	}

}
