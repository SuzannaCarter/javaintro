package javaintro;

import java.util.Scanner;

// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Lab:        10.2

public class AverageArray {

	public static void main(String[] args) {
		while (true) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 double values: ");
		double[] numbers = input.next();
		double[] myArray = (double)(numbers.split(" "));
		
		System.out.println(average(numbers[10]));
		System.out.println(average(numbers[10]));
		
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
	public static int average(int[] array) {
		// TODO Auto-generated method stub
		double result = (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 10.0;
		return (int) result;
	}
	public static double average(double[] array) {
		double result = (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 10.0;
		return (double) result;
	}

}
