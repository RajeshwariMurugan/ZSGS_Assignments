package Task2;

import java.util.Scanner;

/**
 27) Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
		Eg 1: Input: String 1: test123string
					  String 2: 123
			  Output: 4

		Eg 2: Input: String 1: testing12
					 String 2: 1234
			Output: -1
 */
public class string2SubstringString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter String 2: ");
		String s2 = sc.nextLine();

		int a = s1.indexOf(s2);
		System.out.println("Index :" + a);

	}

}
