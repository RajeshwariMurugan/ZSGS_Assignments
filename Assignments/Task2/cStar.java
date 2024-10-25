/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
 29) Write a program to print the alphabet 'C' with the stars based on the given numbers
		Eg 1: Input: 4
			  Output:
 						****
 						*
 						*
 						****
 */
public class cStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1)
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
