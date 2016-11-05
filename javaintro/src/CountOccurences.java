// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 10.1

import java.util.Scanner;
public class CountOccurences {
	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			int[] nums = new int[0];
			int num;
			// Reads a list of 10 integers between 1 and 100
			System.out.print("Enter the integers between 1 and 100: ");
			while ((num = input.nextInt()) != 0) {
				nums = addArr(nums, num);
			}
			// Counts number of occurrences of each number in array
			int searchNum = 0;
			int searchCount = 0;
			for (int j = 0; j < nums.length; j++) {
				if (searchNum != nums[j] && nums[j] != 0) {
					searchNum = nums[j];
					for (int i = j; i < nums.length; i++) {
						if (searchNum == nums[i]) {
							searchCount++;
							nums[i] = 0;
						}
					}
					System.out.print(searchNum + " occurs " + searchCount + " time");
					if (searchCount > 1) {
						System.out.println("s");
					} else {
						System.out.println();
					}
					searchCount = 0;
				}
			}
			// Rerun
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
	private static int[] addArr(int[] nums, int num) {
		int[] dest = new int[nums.length + 1];
		copyArr(nums, dest);
		dest[nums.length] = num;
		return dest;
	}
	private static boolean copyArr(int[] nums, int[] dest) {
		if (nums.length > dest.length)
			return false;
		for (int i = 0; i < nums.length; i++) {
			dest[i] = nums[i];
		}
		return true;
	}
}