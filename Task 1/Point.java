public class Point extends GeometricFigure{

	//coordinates
	private double x;
	private double y;

	Point (double x, double y) {
		this.x = x;
		this.y = y;
	}

	//getter for x
	double getX() {
		return this.x;
	}

	//getter for y
	double getY() {
		return this.y;
	}

	//move method
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}

	//rotate method
	public void rotate(double angle) {
		//nothing happend to point
	}

	//to string
	public String toString() {
		return "Point:  ( "+ this.x + "," + this.y +" )";
	}
}