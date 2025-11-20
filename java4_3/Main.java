package java4_3;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	Point2D point2= new Point2D(6, -3);
	Point3D point3= new Point3D(4, 5, -5);
	System.out.println(point2);
	System.out.println(point3);
	System.out.println(Arrays.toString(point2.getXY()));
	System.out.println(Arrays.toString(point3.getXYZ()));
}
}
