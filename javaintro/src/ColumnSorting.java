import java.util.Scanner;

public class ColumnSorting {
	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a 3-by-3 matrix row by row:");
			double[][] matrix = new double[3][3];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = input.nextDouble();
				}
			}
			double[][] sort = sortColumns(matrix);
			System.out.println("The original array is:");
			display(matrix);
			System.out.println("The column-sorted array is:");
			display(sort);
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

	public static double[][] sortColumns(double[][] m) {
		double[][] result = new double[m.length][m[0].length];
		double[] column = new double[m.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < column.length; j++) {
			column[j] = m[j][i];
			}
		
		column = selectionSort(column);
		for (int j = 0; j < column.length; j++) {
			result[j][i] = column[j];
		}
		}
		return result;
	}

	public static double[] selectionSort(double[] inputList) {
		double[] result = inputList.clone();
		for (int i = 0; i < result.length - 1; i++) {
			double min = result[i];
			int index = i;
			for (int j = i + 1; j < result.length; j++) {
				if (min > result[j]) {
					min = result[j];
					index = j;
				}
			}
			if (index != i) {
				result[index] = result[i];
				result[i] = min;
			}
		}
		return result;
	}

	public static void display(double[][] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
	}
}