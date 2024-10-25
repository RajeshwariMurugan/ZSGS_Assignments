package theaters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
	private String title;
	private String genre;
	private String duration;
	private String director;
	private List<Date> showTimes;

	public Movie(String title, String genre, String duration, String director) {
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.director = director;
		this.showTimes = new ArrayList<>();
	}

	public void addShowTime(Date showTime) {

	}

	public void removeShowTime(String time) {

	}

}
