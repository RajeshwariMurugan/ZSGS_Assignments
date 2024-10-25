package interfaces;

import java.util.Scanner;

interface Playable {

	void play();

	void pause();

	void stop();

}
//______________________ MP3Player ______________________________
class MP3Player implements Playable {
	@Override
	public void play() {
		System.out.println("Playing MP3...");
	}

	@Override
	public void pause() {
		System.out.println("Pausing MP3...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping MP3...");
	}
}

//_______________________ CDPlayer_______________________________
class CDPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Playing CD...");
	}

	@Override
	public void pause() {
		System.out.println("Pausing CD...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping CD...");
	}
}

//______________________ StreamingPlayer ______________________
class StreamingPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Playing streaming music...");
	}

	@Override
	public void pause() {
		System.out.println("Pausing streaming music...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping streaming music...");
	}
}

