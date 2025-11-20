package java6_1;

public class Square extends Rectangle {

	// Constructor đầy đủ
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}

	// Constructor chỉ có side
	public Square(double side) {
		super(side, side);
	}

	// Lấy độ dài cạnh
	public double getSide() {
		return this.width; // width = length nên lấy cái nào cũng được
	}

	// Đặt lại độ dài cạnh
	public void setSide(double side) {
		this.width = side;
		this.length = side; // để giữ hình vuông
	}

	// Override setWidth để giữ hình vuông
	@Override
	public void setWidth(double side) {
		this.setSide(side);
	}

	// Override setLength để giữ hình vuông
	@Override
	public void setLength(double side) {
		this.setSide(side);
	}

	@Override
	public String toString() {
		return String.format("Square[Rectangle[width=%.2f,length=%.2f]]", width, length);
	}
}
