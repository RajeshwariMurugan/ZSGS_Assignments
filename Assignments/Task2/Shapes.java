package Task2;

/**
 * 1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc
 * inherited from a common base class 'Shape'
 */
public class Shapes {
	protected String color;
	private double height;

	// Constructor
	public Shapes(String color) {
		this.color = color;

	}

	// Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public double getDouble() {
		return height;
	}

	public void setDouble(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		Shapes square = new Square("Red", 5.0);
		Shapes rectangle = new Rectangle("Blue", 4.0, 6.0);

		System.out.println("Square area: " + square.calculateArea());
		System.out.println("Rectangle area: " + rectangle.calculateArea());
	}

	private int calculateArea() {
		return 0;
	}

}

class Square extends Shapes {
	private double height;
	private String color;
	
	private String ans=super.color;
	// Constructor
	public Square(String color, double height) {
		super(color);
		//super(height);
		String ans=super.color;
		this.height = height;
	}

	// Getters and Setters
	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		return height * height;
	}
}

class Rectangle extends Shapes {
	private double width;
	private double height;

	// Constructor
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	// Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		return width * height;
	}
}
