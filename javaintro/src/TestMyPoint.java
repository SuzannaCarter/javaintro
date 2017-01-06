// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr.Haddad
// Assignment: 14

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.println("Distance between (" + point1.getX() + ", " + point1.getY() 
		+ ") & ("+ point2.getX() + ", " + point2.getY() + "): " + point1.distance(point2));
	}
}
