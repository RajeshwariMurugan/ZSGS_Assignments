package abstractAndMethods;

import java.util.ArrayList;
import java.util.List;


abstract class Products {
	private String name;
	private double price;

	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public abstract String getDescription();
}

class ElectronicsProducts extends Products {
	private String brand;
	private String model;

	public ElectronicsProducts(String name, double price, String brand, String model) {
		super(name, price);
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String getDescription() {
		return "ElectronicsProduct [Name: " + getName() + ", Brand: " + brand + ", Model: " + model + ", Price: $"
				+ getPrice() + "]";
	}
}

class ClothingProducts extends Products {
	private String size;
	private String color;

	public ClothingProducts(String name, double price, String size, String color) {
		super(name, price);
		this.size = size;
		this.color = color;
	}

	@Override
	public String getDescription() {
		return "ClothingProduct [Name: " + getName() + ", Size: " + size + ", Color: " + color + ", Price: $"
				+ getPrice() + "]";
	}
}

class BookProducts extends Products {
	private String author;
	private String genre;

	public BookProducts(String name, double price, String author, String genre) {
		super();
		this.author = author;
		this.genre = genre;
	}

	@Override
	public String getDescription() {
		return "BookProduct [Name: " + getName()+ ", Author: " + author + ", Genre: " + genre + ", Price: $"
				+ getPrice() + "]";
	}

	
}

public class ProductConsolePro 
{
	private List<Product> products=new ArrayList<>();


	public void addProduct(Products laptop) {
		// TODO Auto-generated method stub
		
	}

	public double calculateTotalPrice() {
		double total = 0.0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}

	public void displayCartDetails() {
		for (Product product : products) {
			System.out.println(product.getDescription());
		}
	}

	public static void main(String[] args) {
		ProductConsolePro cart = new ProductConsolePro();

		Products laptop = new ElectronicsProducts("Laptop", 999.99, "Dell", "XPS 13");
		Products tshirt = new ClothingProducts("T-Shirt", 19.99, "M", "Blue");
		Products  book = new BookProducts("Book", 14.99, "J.K. Rowling", "Fantasy");

		cart.addProduct(laptop);
		cart.addProduct(tshirt);
		cart.addProduct(book);

		System.out.println("Cart Details:");
		cart.displayCartDetails();

		System.out.println("\nTotal Price: $" + cart.calculateTotalPrice());
	}

	
}
