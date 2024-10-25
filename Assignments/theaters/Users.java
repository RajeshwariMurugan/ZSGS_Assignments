package theaters;

public class Users {

	public class Booking {
		private int bookingId;
		private String customerName;
		private Movie movie;
		private int seatsBooked;

		public Booking(int bookingId, String customerName, Movie movie, int seatsBooked) {
			this.bookingId = bookingId;
			this.customerName = customerName;
			this.movie = movie;
			this.seatsBooked = seatsBooked;
		}

		public boolean confirmBooking() {
			return false;

		}

		public void cancelBooking() {

		}
		
	}

}
