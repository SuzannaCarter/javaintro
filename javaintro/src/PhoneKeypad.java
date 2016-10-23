// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Assignment: 9.3

// Displays phone number with letters in all number format
// Rerun

import java.util.Scanner;

public class PhoneKeypad {
   public static void main (String[] args) {
      while(true) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a string: ");
         String s = input.nextLine();
         
         String number="";
         
         for (int i =0; i<s.length(); i++){
        	 char ch = s.charAt(i);
        	 if(Character.isLetter(ch)){
        		 ch = getNumber(Character.toString(ch));
        	 }
        	 
        	 number = number + ch;
        			      	 
         }
                  
         System.out.println("The phone number is " + number);
         
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
   public static char getNumber(String letter) {

	   if (letter.equalsIgnoreCase("A")|| letter.equalsIgnoreCase("B")||letter.equalsIgnoreCase("C"))
		   return '2';
	   if (letter.equalsIgnoreCase("D")|| letter.equalsIgnoreCase("E")||letter.equalsIgnoreCase("F"))
		   return '3';
	   if (letter.equalsIgnoreCase("G")|| letter.equalsIgnoreCase("H")||letter.equalsIgnoreCase("I"))
		   return '4';
	   if (letter.equalsIgnoreCase("J")|| letter.equalsIgnoreCase("K")||letter.equalsIgnoreCase("L"))
		   return '5';
	   if (letter.equalsIgnoreCase("M")|| letter.equalsIgnoreCase("N")||letter.equalsIgnoreCase("O"))
		   return '6';
	   if (letter.equalsIgnoreCase("P")|| letter.equalsIgnoreCase("Q")||letter.equalsIgnoreCase("R")||letter.equalsIgnoreCase("S"))
		   return '7';
	   if (letter.equalsIgnoreCase("T")|| letter.equalsIgnoreCase("U")||letter.equalsIgnoreCase("V"))
		   return '8';
	   if (letter.equalsIgnoreCase("W")|| letter.equalsIgnoreCase("X")||letter.equalsIgnoreCase("Y")||letter.equalsIgnoreCase("Z"))
		   return '9';
	  
	   return 0;
      
   }
}