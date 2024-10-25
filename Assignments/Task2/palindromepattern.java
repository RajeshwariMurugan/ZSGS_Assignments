
package Task2;

import java.util.Scanner;

/**
 * 20)
 */
public class palindromepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k);
			}
			for (int l = i; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
