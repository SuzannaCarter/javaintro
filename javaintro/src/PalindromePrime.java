// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 9.4

// Displays first 100 numbers that are both palindrome and prime
// 10 per line, separated by 1 space

public class PalindromePrime {
	public static void main(String[] args) {
		
		int counter = 0;

		for (int num = 2; counter < 100; num++) {
			if (isPalindrome(num) && isPrime(num)) {
				
				//print 10 to a line
				if (counter%10==0)
					System.out.print('\n');	
				
				System.out.print(num + " ");
				counter++;
				
			}

		}

	}

	public static boolean isPalindrome(int number) {
        int palindrome = number; 
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }


	private static boolean isPrime(int number) {

		for (int i = 2; i <= number; i++) {
			if (number % i == 0 && i != number && i != 1) {
				return false;
			}
		}
		return true;
	}
	


}