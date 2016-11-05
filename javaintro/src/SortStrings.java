// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 10.3

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			// User enters list size
			System.out.println("Enter list size: ");
			int x = input.nextInt();
			Scanner scan = new Scanner(System.in);
			// Reads names into array
			System.out.println("Enter names: ");
			String temp = scan.nextLine();
			String[] list = temp.split(" ");
			// Print array before sorting
			printList(list, "List before sorting: ");
			// Print array after sorting
			list = selectionSort(list);
			printList(list, "List after sorting: ");

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

	private static void printList(String[] list, String status) {
		String names = "";
		for (int i = 0; i < list.length; i++) {
			// status.concat(", " + list[i]);
			names += list[i] + " ";
			// names.concat(list[i]);
		}
		System.out.print(status + names + "\n");
	}

	public static String[] selectionSort(String[] list) {
		int minIndex;
		String temp;

		for (int i = 0; i < list.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j].compareToIgnoreCase(list[minIndex]) < 0) {
					minIndex = j;
				}
			}
			temp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = temp;
		}
		return list;
	}
}
