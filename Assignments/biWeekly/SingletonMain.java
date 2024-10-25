package biWeekly;

class SingleTon {
	private static SingleTon instance;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (instance == null) {

			instance = new SingleTon();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello from the Singleton instance!");
	}
}

class SingletonMain {

	public static void main(String[] args) {

		SingleTon singletonInstance = SingleTon.getInstance();
		for (int i = 0; i < 5; i++) {
			singletonInstance.showMessage();

			SingleTon anotherInstance = SingleTon.getInstance();
			if (singletonInstance == anotherInstance) {
				System.out.println("Both instances are the same.");
			} else {
				System.out.println("Different instances were created.");
			}
		}
	}

}
