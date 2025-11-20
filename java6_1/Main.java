package java6_1;

public class Main {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "red", false); 
		System.out.println(s1); 
		System.out.println(s1.getArea()); 
		System.out.println(s1.getPerimeter()); 
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		Circle s2= (Circle )s1;
		System.out.println(s2.getRadius());

	}
}
