package Task2;

import java.util.Scanner;

public class starLine {

	/**
 26) Write a program to print the following pattern for the given input number.
	Eg 1: Input: 4
		   Output:
				********
				***__***
				**____**
				*______*
				**____**
				***__***
				********
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
//		int n = scanner.nextInt();
//		scanner.close();
//
//		int totalRows = 2 * n;
//		
//
//		for (int i = 0; i < totalRows; i++) {
//			for (int j = 0; j < totalRows; j++) {
//			
//
//			}
//
//			System.out.println();
//		}
//
		
		int a=15,b=0,c=15;
		int temp=a>=b && a>=c ? a:b>a && b>c ? b:c;
		System.out.println(-3%-5);
		
		int x=1;
		int k=++x -x-- + ++x;
		System.out.println(k);
	}

}
