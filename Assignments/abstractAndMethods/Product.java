package abstractAndMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Create an abstract class named Product with methods like getPrice() and
 * getDescription(). Extend the abstract class in classes representing different
 * types of products such as ElectronicsProduct , ClothingProduct , and
 * BookProduct . Display the details of products and calculate the total price
 * in a shopping cart.
 * 
 */
abstract class Product {

	abstract double getPrice();

	abstract String getDescription();

	public static void main(String[] args) {
		List<Product> cart = new ArrayList<>();
		cart.add(new ElectronicsProduct(299.99, "Smartphone"));
		cart.add(new ClothingProduct(49.99, "Jeans"));
		cart.add(new BookProduct(19.99, "Java Programming Book"));

		double total = 0;
		for (Product product : cart) {
			System.out.println("Product: " + product.getDescription() + ", Price: $" + product.getPrice());
			total += product.getPrice();
		}

		System.out.println("Total Price:" + total);

	}
}

class ElectronicsProduct extends Product {
	private double price;
	private String description;

	public ElectronicsProduct(double price, String description) {
		this.price = price;
		this.description = description;
	}

	@Override
	double getPrice() {
		return price;
	}

	@Override
	String getDescription() {
		return description;
	}
}

class ClothingProduct extends Product {
	private double price;
	private String description;

	public ClothingProduct(double price, String description) {
		this.price = price;
		this.description = description;
	}

	@Override
	double getPrice() {
		return price;
	}

	@Override
	String getDescription() {
		return description;
	}
}

class BookProduct extends Product {
	private double price;
	private String description;

	public BookProduct(double price, String description) {
		this.price = price;
		this.description = description;
	}

	@Override
	double getPrice() {
		return price;
	}

	@Override
	String getDescription() {
		return description;
	}
}
