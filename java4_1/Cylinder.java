package java4_1;

public class Cylinder extends Circle {
	private double height=1;

public Cylinder(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
public Cylinder(double radius,double height,String color) {
	super(radius,color);
this.height=height;
}
public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}
public double getVolume() {
	return getArea()*height;
}
}
