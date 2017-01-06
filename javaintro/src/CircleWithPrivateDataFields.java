
public class CircleWithPrivateDataFields {
	private double radius = 1;
	private static double numberOfObjects = 0;

	public CircleWithPrivateDataFields() {
		numberOfObjects++;
	}

	public CircleWithPrivateDataFields(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	public static double getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}
