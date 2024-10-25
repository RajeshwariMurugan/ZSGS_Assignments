package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNo {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter hone number: ");
	            long phoneNumber = scanner.nextLong();
	            System.out.println("Your phone number is: " + phoneNumber);
	        } catch (InputMismatchException e) {
	            System.out.println("Please enter a valid numeric phone number."+e);
	        } 
	    }
	}


