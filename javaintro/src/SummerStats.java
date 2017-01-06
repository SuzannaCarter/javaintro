// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Professor:  Dr. Haddad
// Assignment: 13

public class SummerStats {

	// data field
	private int[][] salaries;

	// constructor method
	public SummerStats(int employees, int years) {
		salaries = new int[employees][years];

		// randomly fills array
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < employees; i++) {
			// System.out.println("This is employee #" + (i + 1));
			for (int j = 0; j < years; j++) {
				salaries[i][j] = r.nextInt(100000);
				// System.out.println("populating salary as " + salaries[i][j]);
			}
		}
	}

	// getter for data field
	public int[][] getSalaries() {
		return salaries;
	}

	// method that returns index of person who made most money
	public int getPersonWhoMadeMostMoneyOverYears() {

		System.out.println("Printing Array... ");
		this.twoDimensionalArrayDump(salaries);

		int[] k = new int[salaries[0].length];

		for (int i = 0; i < salaries.length; i++) {
			for (int j = 0; j < salaries[i].length; j++) {
				k[i] += salaries[i][j];
			}
		}
		int kmax = 0;
		int maxIndex = 0;

		for (int i = 0; i < k.length; i++) {
			if (k[i] > kmax) {
				kmax = k[i];
				maxIndex = i;
			}
		}

		return maxIndex;
	}

	// returns index of year when highest salary was earned
	public int getYearOfHighestSalary() {

		//System.out.println("dumping salaries array");
		//this.twoDimensionalArrayDump(salaries);

		int salary = 0;
		int index = -1;

		for (int i = 0; i < salaries.length; i++) {
			for (int j = 0; j < salaries[i].length; j++) {
				if (salary < salaries[i][j]) {
					salary = salaries[i][j];
					index = j;
				}
			}
		}

		return index;
	}

	// returns total salary of person
	public int getTotalSalary(int person) {

		int totalSalary = 0;
		for (int i = 0; i < salaries[person].length; i++) {
			totalSalary += salaries[person][i];
		}
		//System.out.println("Total Salary = " + totalSalary);
		return totalSalary;
	}

	// returns total amount of money made by all employees
	public int getTotalMoney() {
		int sum = 0;
		for (int i = 0; i < salaries.length; i++) {
			for (int j = 0; j < salaries[i].length; j++) {
				sum += salaries[i][j];
			}
		}

		return sum;
	}

	// returns index of person with highest salary
	public int getPersonWithHighestSalary() {

		//System.out.println("dumping salaries array");
		//this.twoDimensionalArrayDump(salaries);

		int salary = 0;
		int index = -1;

		for (int i = 0; i < salaries.length; i++) {
			for (int j = 0; j < salaries[i].length; j++) {
				if (salary < salaries[i][j]) {
					salary = salaries[i][j];
					index = i;
				}

			}
		}
		return index;
	}

	public double[] getAverageSalaries() {

		//System.out.println("dumping salaries array");
		//this.oneDimensionalArrayDump(salaries);
		
		int[] sums = getSalarySumsByYear();

		double[] averages = new double[sums.length];

		for (int i = 0; i < sums.length; i++) {
			// System.out.println("Sum #" + i + "=" + sums[i]);
			averages[i] = (sums[i] / salaries[0].length);
			// System.out.println("Average #" + i + "=" + averages[i]);
		}

		return averages;

	}

	public int[] getSalarySumsByYear() {
		int[] sums = new int[salaries[0].length];

		for (int j = 0; j < salaries[0].length; j++) {
			for (int i = 0; i < salaries.length; i++) {
				sums[j] += salaries[i][j];

			}

		}
		return sums;
	}

	public int getEmployeeCount() {
		return salaries.length;
	}

	public int getYearCount() {
		return salaries[0].length;
	}

	public int[][] selectionSort(int[][] input) {
		int[][] tempSals = salaries.clone();

		//this.twoDimensionalArrayDump(tempSals);

		int[] max = tempSals[0];

		// Looping through each of the employees
		for (int employee = 0; employee < tempSals.length; employee++) {

			int currentSal = getTotalSalary(employee);

			for (int i = 0; i < tempSals.length; i++) {

				if (currentSal > getTotalSalary(i)) {

					max = tempSals[employee];

				}

				int[] tempSal = tempSals[i];
				tempSals[i] = max;
				tempSals[employee] = tempSal;

			}

		}


		return tempSals;

	}

	public int[][] getSalariesSortedByHighestSalary() {

		int[] sums = new int[salaries.length];
		for (int i = 0; i < salaries.length; i++) {
			sums[i] += getTotalSalary(i);
		}
		//this.oneDimensionalArrayDump(sums);
		return reverse(dirtySumSort(sums));

	}

	public void oneDimensionalArrayDump(double[] averageSalaries) {
		int marker = (int) (Math.random() * 1000);

		//System.out.println("Marker only..." + marker);

		for (int i = 0; i < averageSalaries.length; i++) {
			System.out.println("Array Content(one dim) = " + averageSalaries[i]);
		}

	}

	public void twoDimensionalArrayDump(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array Member = " + i);
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Array Content = " + array[i][j]);

			}
			dumpArraySum(array[i]);
		}
	}

	public void dumpArraySum(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Array Sum = " + sum + "\n");

	}

	private int[][] reverse(int[][] array) {

		int[][] output = new int[array.length][array[0].length];
		int counter = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			//System.out.println("in reverse loop... ");
			output[counter] = array[i];
			counter++;
		}
		return output;
	}

	public int[][] dirtySumSort(int[] sumArray) {

		int[][] outputArray = salaries.clone();
		int[] sortedSums = selectionSort(sumArray);
		for (int i = 0; i < sortedSums.length; i++) {
			int currentSum = sortedSums[i];
			for (int j = 0; j < sortedSums.length; j++) {
				if (currentSum == getTotalSalary(j)) {
					outputArray[i] = salaries[j];
				}
			}
		}

		//this.twoDimensionalArrayDump(outputArray);
		return outputArray;
	}
	
	public int[] selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the index of the minimum value
			int minPos = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[minPos]) {
					minPos = j;
				}
			}
			swap(list, minPos, i);
		}
		return list;
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
