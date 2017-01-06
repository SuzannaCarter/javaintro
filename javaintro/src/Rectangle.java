public class Rectangle {
	private double width;
	private double height;
	
	// no-arg constructor
	public Rectangle() {
		// default values
		width = 1;
		height = 1;
	}
	
	// creates rectangle with specified values
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	// returns width
	public double getWidth() {
		return width;
	}
	
	// returns height
	public double getHeight() {
		return height;
	}
	
	// returns area
	public double getArea() {
		return width * height;
	}
	
	// returns perimeter
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
