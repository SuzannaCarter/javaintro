import java.util.Scanner;

public class LargestRowColumn {
	public static void main(String[] args) {
		while (true) {
			// working array
			int[][] matrix = new int[4][4];

			// let's calculate row sums
			int largestRowIndex = 0;
			int largest = -1;

			// loop through the matrix
			for (int i = 0; i < matrix.length; i++) {

				// counter
				int innersum = 0;

				//
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = (int) (Math.random() * 2);
					innersum += matrix[i][j];
				}

				// this is where we're keeping track of the
				// largest inner array sum (rows, not columns)
				if (innersum > largest) {
					largest = innersum;
					largestRowIndex = i;
				}
			}

			// let's calculate column sums
			int largestColumnIndex = 0;
			largest = -1;

			for (int i = 0; i < matrix[0].length; i++) {
				int count = 0;

				for (int j = 0; j < matrix.length; j++) {
					count += matrix[j][i];
				}

				// keep track of the largest column
				if (count > largest) {
					largest = count;
					largestColumnIndex = i;
				}
			}

			// print the results
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.printf("%d", matrix[i][j]);
				}
				System.out.printf("\n");
			}

			// print the winning row and column selection
			System.out.println("The largest row index: " + largestRowIndex);
			System.out.println("The largest column index: " + largestColumnIndex);

			Scanner scanner = new Scanner(System.in);
			System.out.println("Would you like to restart? Enter y or n: ");
			String goAgain = scanner.next();
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
}
