package biWeekly;

public class FindOnceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 55, 55, 67 };

		int i = 0, count = 0;

		while (i < arr.length - 1) {
			if (arr[i] == arr[i + 1]) {
				i += 2;
			} else {
				count = arr[i];
				break;
			}

		}
		System.out.println(count == 0 ? arr[arr.length - 1] : count);

	}

}
