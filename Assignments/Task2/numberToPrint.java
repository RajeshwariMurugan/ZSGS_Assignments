/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
 4) Write a program to print the number 7.50 without using String(print 7.50  not 7.5).
 */
public class numberToPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number");
		Double number = sc.nextDouble();
		System.out.printf("%.2f\n", number);

	}

}
