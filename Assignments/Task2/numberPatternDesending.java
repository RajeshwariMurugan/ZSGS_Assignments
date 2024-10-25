package Task2;

import java.util.Scanner;

/**
 * 23
 */
public class numberPatternDesending {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows for the pyramid:");

		int n = s.nextInt();

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			for (int k = i; k <= n; k++) {
				System.out.print(k + " ");
			}

			for (int l = n - 1; l >= i; l--) {
				System.out.print(l + " ");
			}

			System.out.println();

		}
	}

}
