// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 10.2

import java.util.Scanner;
public class Statistics {
	public static void main(String[] args) {
		while (true) {
			// Reads list of 10 integers
			System.out.print("Enter 10 numbers: ");
			Scanner input = new Scanner(System.in);
			double[] nums = new double[10];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = input.nextDouble();
			}
			// Computes mean and deviation of array
			System.out.println("The mean is " + mean(nums));
			System.out.println("The standard deviation is " + deviation(nums));
			
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

	private static double mean(double[] nums) {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum / nums.length;
	}

	private static double deviation(double[] nums) {
		double mean = mean(nums);
		double squared = 0;
		for (int i = 0; i < nums.length; i++) {
			squared += Math.pow((nums[i] - mean), 2);
		}
		return Math.sqrt(squared / (nums.length - 1));
	}
}
