package evaluation3;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr[]=new int[] {1, 2, 3, 1, 4, 5, 2, 3, 6};

		int arr[] = new int[] { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		int k = 3;

		for (int i = 0; i <= arr.length - k; i++) {
			int max = 0;
			for (int j = i; j < (i + k); j++) {

				if (max < arr[j]) {
					max = arr[j];

				}
			}

			System.out.println(max);

		}

	}

}
