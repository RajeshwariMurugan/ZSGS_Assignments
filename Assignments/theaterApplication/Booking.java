package theaterApplication;

public class Booking {
	private int bookingId;
	private String customerName;
	private Movie movie;
	private ShowTime showTime;
	private int seatsBooked;

	public Booking(int bookingId, String customerName, Movie movie, ShowTime showTime, int seatsBooked) {
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.movie = movie;
		this.showTime = showTime;
		this.seatsBooked = seatsBooked;
	}

	public boolean confirmBooking() {
		return false;

	}

	public void cancelBooking() {

	}

}
