
public class MySampleClass {

	public static void main(String[] args) {

		
		 doMathOps();
		splitString();
		mutateStrings();

		
		
	}

	private static void splitString() {
		String mySentence = "This is my sentence.  It is fun to have a sentence.";

		// String array of all words in the sentence above
		String[] myArray = mySentence.split(" ");

		// print out each word

		for (int i = 0; i < myArray.length; i++) {

			System.out.println(myArray[i]);

		}
		
	}

	private static void doMathOps() {
		System.out.println(Math.PI); System.out.println(Math.ceil(15.11));
		 System.out.println(Math.floor(15.11));
		 System.out.println(Math.round(15.88));
		 System.out.println(Math.rint(17.5));
		 
		 
		 System.out.println((int)'a'); boolean b = 'a' > 'A';
		 System.out.print('a' > 'A'); System.out.println(b);
	}

	private static void mutateStrings() {

		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3, mutation4;
		System.out.println("Original string: \"" + phrase + "\"");
		System.out.println("Length of string: " + phrase.length());
		mutation1 = phrase.concat(", except from vending machines.");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E', 'X');
		mutation4 = mutation3.substring(3, 30); // excluding position 30
		System.out.println("Mutation #1: " + mutation1);
		System.out.println("Mutation #2: " + mutation2);
		System.out.println("Mutation #3: " + mutation3);
		System.out.println("Mutation #4: " + mutation4);
		System.out.println("Mutated length: " + mutation4.length());

	}
}
