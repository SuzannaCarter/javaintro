// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 13

public class TestFan {

	public static void main(String[] args) {

		// fan objects
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		// assigning values to fan1
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		// assigning values to fan2
		fan2.setSpeed(2);

		// print out
		System.out.println("Fan 1: " + fan1.toString());
		System.out.println("Fan 2: " + fan2.toString());
	}
}
