// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 9.2

// Verifies password 
// Password is valid if all 3 boolean values are true, otherwise it is invalid
// Rerun

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a password: ");
			String password = input.nextLine();

			boolean length = checkLength(password);
			boolean content = checkContent(password);
			boolean digits = checkDigits(password);

			if (length == true && content == true && digits == true) {
				System.out.println("Password is valid");
			} else {
				System.out.println("Invalid password");
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

	private static boolean checkLength(String password) {
		if (password.length() >= 8) {

			return true;
		} else {
			return false;
		}

	}

	private static boolean checkContent(String password) {

		boolean acceptable = true;

		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				acceptable = false;
				break;
			}
		}

		return acceptable;
	}

	private static boolean checkDigits(String password) {
		int x = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				x++;
			}
			if (x >= 2) {
				return true;
			}
		}

		return false;
	}
}