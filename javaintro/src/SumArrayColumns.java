import java.util.Scanner;

public class SumArrayColumns {
	public static void main(String[] args) {
		while (true) {
			java.util.Scanner input = new Scanner(System.in);
			double matrix[][] = new double[3][4];
			System.out.println("Enter a 3-by-4 matrix row by row: ");
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					matrix[row][column] = input.nextDouble();
				}
			}
			for (int column = 0; column < matrix[0].length; column++) {
				System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix, column));
			}
			System.out.println("Would you like to restart? Enter y or n: ");
			String goAgain = input.next();
			if (goAgain.equalsIgnoreCase("y"))
				continue;
			else if (goAgain.equalsIgnoreCase("n"))
				break;
			else {
				System.out.println("Invalid input. Ending program.");
				break;
			}
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}
}
