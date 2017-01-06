// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Professor:  Dr. Haddad
// Assignment: 13

public class SummerStatsTest {

	public static void main(String[] args) {
		
		SummerStats stats = new SummerStats(3,4);
		
		double[] averageSalaries = stats.getAverageSalaries();
		
		System.out.println("index of person who made most money over years: " + stats.getPersonWhoMadeMostMoneyOverYears());
		System.out.println();
		System.out.println("index of year of when highest salary was earned : " + stats.getYearOfHighestSalary());
		System.out.println();
		System.out.println("total amount of money made by the first employee in the array: " + stats.getTotalSalary(0));
		System.out.println();
		System.out.println("total amount of money made by all employees: " + stats.getTotalMoney());
		System.out.println();
		System.out.println("index of person who made highest salary: " + stats.getPersonWithHighestSalary());
		System.out.println();
		printAverageSalaries(averageSalaries);
		System.out.println();
		stats.oneDimensionalArrayDump(averageSalaries);
		System.out.println();
		stats.twoDimensionalArrayDump(stats.getSalariesSortedByHighestSalary());

	}
	
	public static void printAverageSalaries(double[] sals){
		for (int i=0; i<sals.length; i++){
			System.out.println("Average Salary #" + i + "=" + sals[i]);
		}
		
	}
}


