package theaterApplication;

import java.util.ArrayList;
import java.util.List;

public class Screen {
	private int screenId;
	private String screenName;

	private List<Movie> movies;

	public Screen(int screenId, String screenName) {
		this.screenId = screenId;
		this.screenName = screenName;
		this.movies = new ArrayList<>();
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public void removeMovie(String movieName) {
	}

}
