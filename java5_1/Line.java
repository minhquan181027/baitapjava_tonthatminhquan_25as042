package java5_1;

public class Line {
	private Point begin, end;

	public Line(Point begin, Point end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}

	@Override
	public String toString() {
		return "Line [begin=" + begin + ", end=" + end + "]";
	}

	public int getBeginX() {
		return this.begin.getX();
	}

	public int getBeginY() {
		return this.begin.getY();
	}

	public int getEndX() {
		return this.end.getX();
	}

	public int getEndY() {
		return this.end.getX();
	}
	public void setEndX(int endX) {
		this.end.setX(endX);
	}
	public void setEndY(int endY) {
		this.end.setY(endY);
	}
	public void setEndXY(int endX,int endY) {
		this.end.setXY(endX, endY);
	}
	public void setBeginX(int beginX) {
		this.begin.setX(beginX);
	}
	public void setBeginY(int beginY) {
		this.begin.setY(beginY);
	}
	public void setBeginXY(int beginX,int beginY) {
		this.begin.setXY(beginX, beginY);
	}
	public double getLength() {
		 int xDiff = end.getX() - begin.getX();
	       int yDiff = end.getY() - begin.getY();
	       return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}