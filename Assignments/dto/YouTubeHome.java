package dto;

public class YouTubeHome extends YouTubeBase {
	void onCreate()
	{
		if(checkInternetConnection()) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("No Internet Connection");
		}
	}

}
