import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArrays {
	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a 3x3 matrix: ");
		int[][] list1 = new int[3][3];
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[i].length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter another 3x3 matrix: ");
		int[][] list2 = new int[3][3];
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[i].length; j++) {
				list2[i][j] = input.nextInt();
			}
		}
		if (equals(list1, list2)) {
			System.out.println("Two lists are identical");
		} else {
			System.out.println("Two lists are not identical");
		}
	}

	public static boolean equals(int[][] list1, int[][] list2) {

		
		for (int i = 0; i < list1.length; i++) {
			
			//sort both inner arrays on each iteration
			Arrays.sort(list1[i]);
			Arrays.sort(list2[i]);
			
			//loop through both arrays 
			//this assumes each array is the same size
			for (int j = 0; j < list1[i].length; j++) {
				if (list1[i][j] != list2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}