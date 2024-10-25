package theaterApplication;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Booking> bookings;

	public Customer(String name) {
		this.name = name;
		this.bookings = new ArrayList<>();
	}

	public void makeBooking(Movie movie, ShowTime showTime, int seats) {
	}

	public void cancelBooking(int bookingId) {

	}

	public List<Booking> viewBookings() {
		return new ArrayList<>(bookings);
	}
}
