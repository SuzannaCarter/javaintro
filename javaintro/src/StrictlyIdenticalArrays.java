// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 10.4

import java.util.Scanner;
import java.util.Arrays;
public class StrictlyIdenticalArrays {
	public static void main(String[] args) {
		while (true) {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Enter size of list 1: ");
			int x = input.nextInt();
			System.out.println("Enter size of list 2: ");
			int y = input.nextInt();
			System.out.println("Enter list1: ");
			int[] list1 = new int[x];
			for (int i = 0; i < x; i++) {
				list1[i] = input.nextInt();
			}
			System.out.println("Enter list2: ");
			int[] list2 = new int[y];
			for (int i = 0; i < y; i++) {
				list2[i] = input.nextInt();
			}
			// Sees if 2 arrays are strictly identical
			if (equals(list1, list2)) {
				System.out.println("Two lists are strictly identical");
			} else {
				System.out.println("Two lists are not strictly identical");
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
	
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length) {
			return false;
		}
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}
		return true;
	}
}
