package interfaces;

import java.util.Scanner;

public class MainSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		int n = scanner.nextInt();
		int[] array = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Select a sorting algorithm:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Quick Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Selection Sort");
		System.out.println("5. Insertion Sort");
		System.out.println("6. Heap Sort");

		System.out.println("7. exit");
		int choice = scanner.nextInt();
		Sortable sorter = null;

		switch (choice) {
		case 1:
			sorter = new BubbleSort();
			break;
		case 2:
			sorter = new QuickSort();
			break;
		case 3:
			sorter = new MergeSort();
			break;
		case 4:
			sorter = new SelectionSort();
			break;
		case 5:
			sorter = new InsertionSort();
			break;
		case 6:
			sorter = new HeapSort();
			break;

		default:
			System.out.println("Invalid choice.");
			System.exit(0);
		}

		sorter.sort(array);

		System.out.println("Sorted array:");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}
}
