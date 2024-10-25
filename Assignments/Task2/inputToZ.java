/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
 1) Write a program to print a letters from the user input character to 'Z'
  without using strings. 
 
 		Example 1: input : X 
 					Output : XYZ 
 
 		Example 2: 	Input : M
 					Output : MNOPQRSTUWXYZ
 
 */
public class inputToZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		char a = sc.next().charAt(0);
		int ascii = (int) a;
		for (int i = ascii; i <= 90; i++) {
			ascii = (int) a;
			System.out.print(a);
			a++;
		}

	}

}
