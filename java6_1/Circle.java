package java6_1;

public class Circle extends Shape {
	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
	
		this.radius=radius;
	}

	protected double radius = 1;

	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius * 2 * Math.PI;

	}

	public String toString() {
		return String.format("Circle[Shape[color=%s,filled=%B],radius=%.2f]", color, filled, radius);
	}
}
