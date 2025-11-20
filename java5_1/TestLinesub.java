package java5_1;

public class TestLinesub{
	public static void main(String[] args) {
    Linesub l1 = new Linesub(1, 2, 4, 6);
    System.out.println(l1);  // LineSub[begin=(1,2), end=(4,6)]

    System.out.println("Length: " + l1.getLength());     // 5.0
    System.out.println("Gradient: " + l1.getGradient()); // khoảng 0.927 rad

    l1.setBeginXY(0, 0);
    l1.setEndXY(3, 4);
    System.out.println(l1);  // LineSub[begin=(0,0), end=(3,4)]
    System.out.println("Length: " + l1.getLength());     // 5.0
}
}
