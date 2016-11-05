import java.util.Scanner;

public class AddMatricies {
	public static void main(String[] args) {
		while (true) {
			java.util.Scanner input = new Scanner(System.in);
			double[][] matrix1 = new double[3][3];
			System.out.println("Enter matrix1: ");
			for (int row = 0; row < matrix1.length; row++) {
				for (int column = 0; column < matrix1[0].length; column++) {
					matrix1[row][column] = input.nextDouble();
				}
			}
			double[][] matrix2 = new double[3][3];
			System.out.println("Enter matrix2: ");
			for (int row = 0; row < matrix2.length; row++) {
				for (int column = 0; column < matrix2[0].length; column++) {
					matrix2[row][column] = input.nextDouble();
				}
			}
			double[][] sum = addMatrix(matrix1, matrix2);
			System.out.println("The matrices are added as follows: ");
			for (int i = 0; i < sum.length; i++) {
				for (int j = 0; j < sum[0].length; j++) {
					System.out.print(matrix1[i][j] + " ");
					if (i == 1 && j == 2) {
						System.out.print(" + ");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = 0; j < sum[0].length; j++) {
					System.out.print(matrix2[i][j] + " ");
					if (i == 1 && j == 2) {
						System.out.print(" = ");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = 0; j < sum[0].length; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
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

	public static double[][] addMatrix(double[][] a, double[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			return null;
		}
		double[][] result = new double[b.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
}
