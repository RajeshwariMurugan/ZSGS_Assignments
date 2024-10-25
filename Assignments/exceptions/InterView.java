package exceptions;

public class InterView {

	public static void main(String[] args) {

		// ________________
		Object[] objects = { 42, "Hello", 3.14, "World", 100 };

		for (Object obj : objects) {
			switch (obj) {
			case Integer i -> System.out.println("Integer: " + i);
			case String s -> System.out.println("String: " + s);
			default -> System.out.println("Other type");
			}

		}
		// ______________________
		Dog d = new Dog();
		d.sound();

		// _______________
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			break;
			// System.out.println("hii");
		}

		int a[] = { 1, 2, 3, 4 };
		System.out.println(a instanceof Object);
		System.out.println(a instanceof int[]);

		System.out.println();
		;
		;
		;
		;
		;
	}

}

class Animal {

	public int a;

	Animal() {
		a = 5;
		System.out.println("Animal constructor called");
	}

	Object sound() {
		System.out.println("Animal sound");
		return null;
	}
}

class Dog extends Animal {
	Dog() {
		int b = super.a; // Calling parent class constructor
		System.out.println("Dog constructor called" + b);
	}

	Object sound() {
		Object obj = super.sound(); // Calling parent class method
		System.out.println("Dog barks" + obj);
		return obj;
	}
}
