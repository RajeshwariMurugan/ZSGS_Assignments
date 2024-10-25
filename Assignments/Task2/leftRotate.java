/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
  19) Java Program to left rotate the elements of a multidimensional array.
 */
public class leftRotate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int arrlength = sc.nextInt();

		System.out.println("Enter Array ELements");
		int[] arr = new int[arrlength];

		for (int i = 0; i < arrlength; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter how many time array rotate by left");
		int n = sc.nextInt();

		
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			int j, first;
			first = arr[0];

			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}

		System.out.println();

		System.out.println("Array after right rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
