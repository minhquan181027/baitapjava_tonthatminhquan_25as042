package java6_1;

public class Rectangle extends Shape {
	protected double width = 1;
	protected double length = 2;

	public Rectangle(double width, double length) {
	this.width=width;
	this.length=length;
		
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {

		return 2 * (width + length);
	}

	public String toString() {
		return String.format("Circle[Shape[color=%.s,filled=%.B],width=%.2f,length=%.2f]", color, filled, width,
				length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
