package java3_3;

public class Main {
public static void main(String[] args) {
	Mytime t1= new Mytime(23, 59, 59);
	Mytime t2 = new Mytime(0, 0, 0);
	System.out.println(t1.nextSecond());
	System.out.println(t2.previousSecond());
}
}
