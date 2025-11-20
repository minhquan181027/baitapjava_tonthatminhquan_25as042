package java1_1;

public class Circle {
private double radius=1.0;
private String color="red";

public Circle() { 
   radius = 1.0;
   color = "red";}
public Circle(double r) {
	this.radius=r;
	color="red";
}
public double getRadius() {
	return this.radius;
}
public double getArea() {
	return this.radius*this.radius*Math.PI;
}

}
