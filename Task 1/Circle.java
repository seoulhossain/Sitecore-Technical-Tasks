public class Circle extends GeometricFigure {

	// circle consists of center and radius
	private Point center;
	private double radius;

	// constructor
	Circle(double x, double y, double radius) {
		this.center = new Point(x, y);
		this.radius = radius;
	}

	// move method
	public void move(double x, double y) {
		this.center.move(x, y);
	}

	// rotate method
	public void rotate(double angle) {
		// nothing happend to circle
	}

	// to string
	public String toString() {
		return "Circle:  center = ( " + center.getX() + "," + center.getY() + " )" + ", radius = " + radius;
	}

}
