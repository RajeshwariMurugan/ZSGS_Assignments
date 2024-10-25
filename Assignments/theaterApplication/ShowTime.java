package theaterApplication;

public class ShowTime {
    private String time;
    private int availableSeats;

    public ShowTime(String time, int availableSeats) {
        this.time = time;
        this.availableSeats = availableSeats;
    }

    public String getTime() {
        return time;
    }

    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    public void cancelSeat() {
        availableSeats++;
    }
}
