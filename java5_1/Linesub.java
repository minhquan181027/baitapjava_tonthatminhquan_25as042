package java5_1;

public class Linesub extends Point {

	public Linesub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point(endX, endY);
		// TODO Auto-generated constructor stub
	}

	public Linesub(Point begin, Point end) {
	        super(begin.getX(), begin.getY()); // tái tạo begin Point từ superclass
	        this.end = end;
	    }

	// A line needs two points: begin and end.
	// The begin point is inherited from its superclass Point.
	private Point end; // Ending point

	// ----- Public methods -----

	@Override
	public String toString() {
		return "LineSub[begin=(" + getX() + "," + getY() + "), end=" + end + "]";
	}

	public Point getBegin() {
		// "begin" là chính bản thân object (vì nó kế thừa từ Point)
		return new Point(getX(), getY());
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(Point begin) {
		setX(begin.getX());
		setY(begin.getY());
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	// ----- Getter -----
	public int getBeginX() {
		return getX();
	}

	public int getBeginY() {
		return getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	// ----- Setter -----
	public void setBeginX(int x) {
		setX(x);
	}

	public void setBeginY(int y) {
		setY(y);
	}

	public void setBeginXY(int x, int y) {
		setXY(x, y);
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}

	// ----- Geometry methods -----
	public double getLength() {
		int xDiff = end.getX() - getX();
		int yDiff = end.getY() - getY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = end.getX() - getX();
		int yDiff = end.getY() - getY();
		return Math.atan2(yDiff, xDiff);
	}
}
