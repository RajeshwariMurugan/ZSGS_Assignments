package exceptions;

public class Calculate {

	public String calculate(int operand1, int operand2, String operation) {

		if (operation == null) {
			throw new IllegalArgumentException("Operation cannot be null");
		}
		if (operation.isEmpty()) {
			throw new IllegalArgumentException("Operation cannot be empty");
		}
		try {
			switch (operation) {
			case "-":
				return operand1 + " + " + operand2 + " = " + (operand1 - operand2);
			case "/":
				return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
			case "*":
				return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
			case "+":
				return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
			default:
				throw new IllegalOperationException(String.format("Operation does not exist", operation));
			}
		} catch (ArithmeticException e) {
			throw new IllegalOperationException("Division by zero is not allowed");
		}

	}
	
	public static void main(String args[]) throws Exception {
		Calculate calculates=new Calculate();
		 String temp=calculates.calculate(12, 0, "/");
		System.out.println(temp+" "+calculates.calculate(4,7,"+"));
	}
}

class IllegalOperationException extends RuntimeException {
	public IllegalOperationException(String errorMessage) {
		System.out.println(errorMessage);
	}

//	IllegalOperationException(String errorMessage, Throwable cause) {
//		super(errorMessage, cause);
//}
}
