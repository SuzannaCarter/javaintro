// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr.Haddad
// Assignment: 14

public class MyPoint {

	// data fields
	private double x;
	private double y;

	// no-arg constructor that sets point as (0,0)
	MyPoint() {
		this(0, 0);
	}

	// constructor that uses specified coordinates
	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// getter method of x data field
	public double getX() {
		return x;
	}

	// getter method of y data field
	public double getY() {
		return y;
	}

	// returns distance
	public double distance(MyPoint myPoint) {
		return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
	}

	// returns distance between 2 points
	public double distance(double x, double y) {
		return distance(new MyPoint(x, y));
	}
}
