package Task2;

import java.util.Scanner;

/**
 * 2) Write a program to define the functionality of a Bitwise operator
 */

public class bitwiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Bitwise AND  "+(num1&num2));
		System.out.println("Bitwise OR  "+(num1|num2));
		System.out.println("Bitwise XOR  "+(num1^num2));
		System.out.println("Bitwise NOT  "+(~num1)+" "+(~num2));
		System.out.println("Bitwise LeftShift  "+(num1<<num2));
		System.out.println("Bitwise RightShift  "+(num1>>num2));
		//System.out.println("Bitwise UnsignedLeftShift  "+(num2<<<num1));
		System.out.println("Bitwise UnsignedRightShift  "+(num1>>>num2));

		//System.out.println(5<<2);

	}

}
