import java.util.*;

public class Aggregation extends GeometricFigure {

	// has random number of geometric figures
	private ArrayList<GeometricFigure> geometricFigures;

	// constructor
	Aggregation() {
		geometricFigures = new ArrayList<>();
	}

	// add new geo geometric figure
	public void add(GeometricFigure g) {
		geometricFigures.add(g);
	}

	// move method
	public void move(double x, double y) {
		// move all
		for (GeometricFigure g : geometricFigures) {
			g.move(x, y);
		}
	}

	// rotate method
	public void rotate(double angle) {
		// rotate all
		for (GeometricFigure g : geometricFigures) {
			g.rotate(angle);
		}
	}

	// to string
	public String toString() {

		String string = "";
		for (GeometricFigure g : geometricFigures) {
			string += g.toString() + "\n";
		}
		return string;
	}

	public static void main(String[] args) {
		Aggregation test = new Aggregation();

		// randome figures
		Point point = new Point(12, 13);
		Line line2 = new Line(1, 1, 2, 3);
		Line line3 = new Line(1, 2, 4, 5);
		Circle circle1 = new Circle(2, 4, 7);
		Circle circle2 = new Circle(5, 8, 6);
		// add them
		test.add(point);
		test.add(line2);
		test.add(line3);
		test.add(circle1);
		test.add(circle2);

		// print initial view
		System.out.println(test);

		// move
		test.move(5, 6);
		System.out.println();

		// current view
		System.out.println(test);

		// rotate by 30 degrees
		test.rotate(30);
		System.out.println();

		// current view
		System.out.println(test);

	}

}