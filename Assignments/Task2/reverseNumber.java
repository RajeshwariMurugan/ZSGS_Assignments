/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
  9) Write a program to display the number in reverse order without use of String functions.
		Eg 1: Input: 12345
			  Output :The number in reverse order is : 54321
 */
public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input for reverse");
		int num = sc.nextInt();
		int result = reverseNumber(num);
		System.out.println("The number in reverse order is : " + result);
		
	    
	}

	public static int reverseNumber(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
		
		
	}

}
