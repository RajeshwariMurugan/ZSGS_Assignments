package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twoArrayWithoutduplicate {
	/*
	 16) Given two sorted arrays, merge them such that the elements are not repeated
	  Example 1: Input: Array 1: 2,4,5,6,7,9,10,13 
	 					Array 2: 2,3,4,5,6,7,8,9,11,15 
	 			Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter length of first array");
		int n1 = sc.nextInt();
		int[] arr1 = inputarr(n1);

		System.out.println("Enter length of second array");
		int n2 = sc.nextInt();
		int[] arr2 = inputarr(n2);

		int[] mergedArray = mergeArrays(arr1, arr2);

		System.out.println("Merged array: " + Arrays.toString(mergedArray));
	}

	private static int[] inputarr(int n) {
		// TODO Auto-generated method stub
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		List<Integer> mergedList = new ArrayList<>();

		int i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedList.add(arr1[i++]);
			} else if (arr1[i] > arr2[j]) {
				mergedList.add(arr2[j++]);
			} else {
				mergedList.add(arr1[i]);
				i++;
				j++;
			}
		}

		while (i < arr1.length) {
			mergedList.add(arr1[i++]);
		}

		while (j < arr2.length) {
			mergedList.add(arr2[j++]);
		}

		int[] mergedArray = new int[mergedList.size()];
		for (int k = 0; k < mergedList.size(); k++) {
			mergedArray[k] = mergedList.get(k);
		}

		return mergedArray;
	}
}
