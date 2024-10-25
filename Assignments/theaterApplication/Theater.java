package theaterApplication;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	private String name;
	private List<Screen> screens;
	private String location;

	public Theater(String name, String location) {
		this.name = name;
		this.location = location;
		this.screens = new ArrayList<>();
	}

	public void addScreen(Screen screen) {
		screens.add(screen);
	}

	public void removeScreen(int screenId) {

	}

}
