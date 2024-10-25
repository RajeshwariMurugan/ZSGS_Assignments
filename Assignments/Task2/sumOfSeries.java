package Task2;

import java.util.Scanner;

/**
 * 28) Write a program to find the sum of the series. The series will be like 1 +11 + 111 + 1111 +.. n terms.
		Eg 1: Input: Input the number of terms : 5
			Output :
					1 + 11 + 111 + 1111 + 11111
					The Sum is : 12345
			Eg 2: Input: Input the number of terms : 3
			Output :
					1 + 11 + 111
					The Sum is : 123
 */
public class sumOfSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the number of terms: ");
		int n = scanner.nextInt();

		long sum = 0;
		long term = 0;

		System.out.print("The series is: ");
		for (int i = 1; i <= n; i++) {
			term = term * 10 + 1;
			sum += term;
			if (i == n) {
				System.out.print(term);
			} else {
				System.out.print(term + " + ");
			}
		}

		System.out.println("\nThe Sum is: " + sum);

	}

}
