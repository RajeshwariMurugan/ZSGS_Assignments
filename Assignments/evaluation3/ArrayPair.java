package evaluation3;

import java.util.Arrays;

public class ArrayPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 3, 2, 3, 2, 2, 2 };
		//int arr[] = new int[] {1,2,3,4};
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		System.out.println(Arrays.toString(arr));
		int count = 1;
		boolean val = false,val2=true;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
			if (arr[i] == n / 2) {
				val = true;
			} else {
				if (count % 2 != 0) {
					val2=false;
				} else
					count = 1;
			}
		}

		System.out.println(val&& count%2==0 );

	}
}
