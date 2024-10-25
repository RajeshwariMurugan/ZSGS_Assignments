package Task2;

import java.util.Scanner;

public class arrayToshortCopySDUplicate {
	/*
	 * 13) Java Program to print the smallest element in an array 
	 * 14) Java Program to copy all elements of one array into another array 
	 * 15) Java Program to print the duplicate elements of an array
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many numbers print");
		int n = sc.nextInt();
		int i;
		int[] numbers = new int[n];
		for (i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		int smallest = numbers[0];

		for (i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest)
				smallest = numbers[i];
		}

		System.out.println("Smallest Number is : " + smallest);

		int[] copiedArray = new int[numbers.length];
		for (i = 0; i < numbers.length; i++) {
			copiedArray[i] = numbers[i];
			System.out.print(copiedArray[i]+"   ");
		}
		System.out.println("Array to copied");

		System.out.println(" Duplicate Elements are: ");
		for (i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j])
					System.out.println(numbers[j]);
			}
		}

	}

}
