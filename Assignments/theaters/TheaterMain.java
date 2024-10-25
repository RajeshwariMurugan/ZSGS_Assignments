package theaters;

import java.util.Scanner;


public class TheaterMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theater theater = new Theater("Raji", "Surandai",120);
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		byte person = sc.nextByte();
		showMenu(person);
	}

	private static void showMenu(byte person) {

		if (person == 1) {
			System.out.println("1. Add Screen");
			System.out.println("2. Add Movie");
		} else if (person == 2) {
			System.out.println("3. Ticket Booking");
			System.out.println("4. Cancel Booking");
			System.out.println("5. View Bookings");
		} else
			System.out.println("6. Exit");
	}

}