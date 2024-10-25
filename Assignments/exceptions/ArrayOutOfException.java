package exceptions;

public class ArrayOutOfException {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			int number = arr[5];
			System.out.println("Number: " + number);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of exception."+e);
		}
	}
}
