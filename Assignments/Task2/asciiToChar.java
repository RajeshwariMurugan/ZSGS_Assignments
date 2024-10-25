package Task2;

import java.util.Scanner;

/**
 * 8) Program to Find ASCII Value of a Character
 */
public class asciiToChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one character");
		char ch=sc.next().charAt(0);
        System.out.println("ASCII value of " + ch + " is: " + (int)ch);


	}

}
