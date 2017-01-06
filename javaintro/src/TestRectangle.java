public class TestRectangle {

	public static void main(String[] args) {
		// 2 rectangle objects
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		// prints out width, height, area and perimeter of each object
		System.out.println("Rectangle 1's width = " + r1.getWidth() + ", height = " + r1.getHeight() 
		+ ", area = " + r1.getArea() + ", perimeter = " + r1.getPerimeter());
		System.out.println("Rectangle 2's width = " + r2.getWidth() + ", height = " + r2.getHeight() 
		+ ", area = " + r2.getArea() + ", perimeter = " + r2.getPerimeter());

	}

}
