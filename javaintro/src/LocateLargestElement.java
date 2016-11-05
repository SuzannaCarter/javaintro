import java.util.Scanner;

public class LocateLargestElement {

	public static void main(String[] args) {
		while (true) {
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array:");
		int i = input.nextInt();
		int j = input.nextInt();
		int[] result;
		System.out.println("Enter the array:");
		double[][] array = new double[i][j];
		for (int k = 0; k < i; k++) {
			for (int l = 0; l < j; l++) {
				array[k][l] = input.nextDouble();
			}
		}
		result = locateLargest(array);
		System.out.println("The location of the largest element is at (" + result[0] + ", " + result[1] + ")");
		
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
	public static int[] locateLargest(double[][] a) {
		double max = 0;
		int[] result = new int[2];
		for (int k = 0; k < a.length; k++) {
			for (int l = 0; l < a[k].length; l++) {
				if (a[k][l] > max) {
					max = a[k][l];
					result[0] = k;
					result[1] = l;
				}
			}
		}
		return result;
	}
}