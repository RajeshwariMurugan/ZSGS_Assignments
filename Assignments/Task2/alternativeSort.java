package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class alternativeSort {
	/*
	 * 17) Alternate sorting: Given an array of integers, rearrange the array in
	 * such a way that the first element is first maximum and second element is
	 * first minimum. Example: Input : {1, 2, 3, 4, 5, 6, 7} Output: {7, 1, 6, 2, 5,
	 * 3, 4}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of the Array :");
		int len = sc.nextInt();
		int[] arr = new int[len];
		int i, j, max, min;
		System.out.println("Enter the Array elements...");
		for (i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < len - 1; i++) {
			max = i;
			min = i;
			for (j = i + 1; j < len; j++) {
				if (arr[j] > arr[max])
					max = j;
				else if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = i % 2 == 0 ? arr[max] : arr[min];
			arr[i % 2 == 0 ? max : min] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
