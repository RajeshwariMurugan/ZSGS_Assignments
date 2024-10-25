package interfaces;

import java.util.*;

public class TestTrack {

	public static void race(RemoteControlCar car) {
		car.drive();
	}

	public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
		Collections.sort(cars);
		return cars;
	}
}

interface RemoteControlCar {
	void drive();

	int getDistanceTravelled();
}

class ExperimentalRemoteControlCar implements RemoteControlCar {
	private int distanceTravelled = 0;

	public void drive() {
		distanceTravelled += 20;
	}

	public int getDistanceTravelled() {
		return distanceTravelled;
	}
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
	private int distanceTravelled = 0;
	private int numberOfVictories = 0;

	public void drive() {
		distanceTravelled += 10;
	}

	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public int getNumberOfVictories() {
		return numberOfVictories;
	}

	public void setNumberOfVictories(int numberOfVictories) {
		this.numberOfVictories = numberOfVictories;
	}

	@Override
	public int compareTo(ProductionRemoteControlCar other) {
		return other.numberOfVictories - this.numberOfVictories;
	}
}
