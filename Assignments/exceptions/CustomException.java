package exceptions;

public class CustomException extends Exception {
	public static void main(String[] args) {
		try {
			throw new MyCustomException("This is a custom exception!");
		} catch (MyCustomException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}

class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super(message);
	}
}