package theaters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {
	private String name;
	private Map<Integer, String> screens;
	private String location;
	private List<Movie> movie;
	private static int SEATS;

	public Theater(String name, String location,int seats) {
		this.name = name;
		this.location = location;
		SEATS=seats;
		this.screens = new HashMap<>();
		this.movie = new ArrayList<>();
	}

	public void addScreen(int id, String name) {
		screens.put(id, name);
	}

	public void removeScreen(int screenId) {

	}

	public void addMovie(Movie movies) {
		movie.add(movies);
	}

	public void removeMovie(String movie) {

	}
	
	public boolean availableSeats(int count) {
		if(SEATS>count)
			SEATS-=count;
		else
			return false;
		return true;
	}

}
