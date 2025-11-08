package java5_1;

public class TestLine {
public static void main(String[] args) {
	Line 	l1 = new Line(0, 0, 4, 6);
	System.out.println(l1);
	Point p1= new Point(3, 4);
	Point p2= new Point(2, 7);
	Line l2 = new Line(p1, p2);
	System.out.println(l2);
	System.out.println("độ dài l2 là:"+l2.getLength());
	System.out.println("góc nghiêng l2 là:"+l2.getGradient());
}
}
