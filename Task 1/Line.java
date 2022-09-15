public class Line extends GeometricFigure {

	// Line consists of two points
	private Point p1;
	private Point p2;

	// constructor creation
	Line(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	// move method
	public void move(double x, double y) {
		this.p1.move(x, y);
		this.p2.move(x, y);
	}

	// rotate method
	public void rotate(double angle) {

		// lenth of the line
		double length = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));

		// angle
		double theta = Math.atan((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));

		// new angle
		theta += Math.toRadians(angle);

		// after rotation p2 will be changed
		double xNew = p1.getX() + length * Math.cos(theta);
		double yNew = p1.getY() + length * Math.sin(theta);
		// round off
		xNew = (Math.round(xNew * 100)) / 100.0;
		yNew = (Math.round(yNew * 100)) / 100.0;
		// assign
		p2 = new Point(xNew, yNew);
	}

	// to string
	public String toString() {
		return "Line:  ( " + p1.getX() + "," + p1.getY() + " )" + ", ( " + p2.getX() + "," + p2.getY() + " )";
	}

	public static void main(String[] args) {

		// Test
		Line line = new Line(0, 0, 1, 1);
		System.out.println(line);

		// move 1,1
		line.move(1, 1);
		System.out.println(line);

		// rotate by 90 degrees
		line.rotate(90);
		System.out.println(line);
	}
}