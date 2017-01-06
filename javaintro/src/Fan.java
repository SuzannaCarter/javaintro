// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 13

public class Fan {

	// Fan speed
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	// data fields
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	// getters and setters for data fields
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// no-arg constructor for default
	Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	// string description
	public String toString() {
		if (on) {
			String x = "The speed is " + speed + ". The radius is " + radius + ". The color is " + color;
			return x;
		} else {
			String y = "The fan is off. The radius is " + radius + ". The color is " + color;
			return y;
		}
	}
}