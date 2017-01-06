import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation q = new QuadraticEquation(a, b, c);
		q.getDiscriminant();
		q.getRoot1();
		q.getRoot2();

		if (Math.pow(b, 2) - 4 * a * c > 0) {
			System.out.println("The 2 roots are: " + q.getRoot1() + " and " + q.getRoot2());
		} 
		else if (Math.pow(b, 2) - 4 * a * c == 0) {
			System.out.println("The root is: " + q.getRoot1());
		} 
		else {
			System.out.println("The equation has no roots.");
		}
	}
}