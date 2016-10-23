import java.text.NumberFormat;
import java.util.Scanner;

public class MySampleClass {

	public static void main(String[] args) {

		// Don't: Math math = new Math();
		/*
		 * System.out.println(Math.PI); System.out.println(Math.ceil(15.11));
		 * System.out.println(Math.floor(15.11));
		 * System.out.println(Math.round(15.88));
		 * System.out.println(Math.rint(17.5));
		 * 
		 * 
		 * System.out.println((int)'a'); boolean b = 'a' > 'A';
		 * System.out.print('a' > 'A'); System.out.println(b);
		 */
		// Character c = new Character('S');

		/*
		 * System.out.println(Character.isLowerCase('X'));
		 * 
		 * char d = 'a';
		 * 
		 * if (d<=122 && d>=97){
		 * 
		 * System.out.println(d + " is lower case"); }
		 * 
		 * System.out.println(d);
		 * 
		 */

		String mySentence = "This is my sentence.  It is fun to have a sentence.";

		// String array of all words in the sentence above
		String[] myArray = mySentence.split(" ");

		// print out each word

		for (int i = 0; i < myArray.length; i++) {

			System.out.println(myArray[i]);
			

		}

		/*
		 * for(String i : myArray){ System.out.println(i); }
		 * 
		 * String s = "my name is suzanna"; System.out.println(s + " or scott");
		 * 
		 * System.out.println ("Original string: \"" + s + "\"");
		 * System.out.println ("Length of string: " + s.length());
		 * 
		 * String phrase = "Change is inevitable"; String mutation1, mutation2,
		 * mutation3, mutation4; System.out.println ("Original string: \"" +
		 * phrase + "\""); System.out.println ("Length of string: " +
		 * phrase.length()); mutation1 =
		 * phrase.concat(", except from vending machines."); mutation2 =
		 * mutation1.toUpperCase(); mutation3 = mutation2.replace ('E', 'X');
		 * mutation4 = mutation3.substring (3, 30); //excluding position 30
		 * System.out.println ("Mutation #1: " + mutation1); System.out.println
		 * ("Mutation #2: " + mutation2); System.out.println ("Mutation #3: " +
		 * mutation3); System.out.println ("Mutation #4: " + mutation4);
		 * System.out.println ("Mutated length: " + mutation4.length());
		 * 
		 * System.out.printf("%12s%12s%12c", "Suzanna", "Carter", (char)'6');
		 * 
		 */
/*
		final int NUM_GAMES = 12;
		int won;
		double ratio;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of games won (0 to " + NUM_GAMES + "): ");
		won = scan.nextInt();
		// input validation
		while (won < 0 || won > NUM_GAMES) {
			System.out.print("Invalid input. Please reenter: ");
			won = scan.nextInt();

			won++;
		}
		ratio = (double) won / NUM_GAMES;
		NumberFormat fmt = NumberFormat.getPercentInstance();
		System.out.println();
		System.out.println("Winning percentage: " + fmt.format(ratio));

	
	*/
		/*
		int x=0;
		while("Hello Suzanna"){	
			System.out.println("Yippee... this is infinite!");
			x++;
		}
		*/
		
		int i;
		for (i = 0; i < 2; i++) {
		System.out.println("Welcome to Java!");
		}
	}
}
