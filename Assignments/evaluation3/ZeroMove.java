package evaluation3;

import java.util.Arrays;

public class ZeroMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,0,2,3,0,0,4,5,0,7,8,9,6,7};
		//int arr[] = new int[] { 1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				rotate(arr, i + 1);
				// System.out.println(Arrays.toString(arr));
				i++;
			}
		}

		for (int num : arr)
			System.out.print(num + "  ");

	}

	private static void rotate(int[] arr, int k) {

		for (int i = arr.length - 1; i >= k; i--) {
			arr[i] = arr[i - 1];
		}

		arr[k] = 0;

	}

}
