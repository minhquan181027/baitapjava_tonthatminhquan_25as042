package java3_2;

public class Main {
public static void main(String[] args) {
	MyPolynomial p1= new MyPolynomial(1,0,5,7);
	MyPolynomial p2= new MyPolynomial(4,3,6,2);
	MyPolynomial p3= new MyPolynomial(1,2,5,9);
	System.out.println("P1(x)="+p1);
	System.out.println("P2(x)="+p2);
	System.out.println("P3(x)="+p3);
	System.out.println(p1.evaluate(5));
	System.out.println(p2.addInto(p3));
	System.out.println(p1.multiple(p2));
}
}
