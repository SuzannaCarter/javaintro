// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr. Haddad
// Lab:        10.1
import java.util.Scanner;
public class AssigningGrades {
	public static void main(String args[]) {
		while(true) {
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter the number of students: ");
		   int students = input.nextInt();
		   System.out.println("Enter " + students + " scores: ");
		   int[] grades = new int[students];
		   for (int i =0; i < grades.length; i++) {
		      grades[i] = input.nextInt();
		      System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + letterGrade(grades[i]));
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

   private static char letterGrade(int i) {
	  // TODO Auto-generated method stub
	   char result = 'A';
	   if (i >= 90) {
		   result = 'A';
	   }
	   else if (i >= 80) {
		   result = 'B';
	   }
	   else if (i >= 70) {
		   result = 'C';
	   }
	   else if (i >= 60) {
		   result = 'D';
	   }
	   else {
		   result = 'F';
	   }
       return result;
		}
		
	}


