import java.util.Scanner;

public class WeeklyHours {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int employees = input.nextInt();
		int[][] hours = new int[employees][7];
		int[][] sum = new int[employees][2];
		for (int i = 0; i < hours.length; i++) {
			System.out.println("Enter hours of employee " + i);
			for (int j = 0; j < hours[0].length; j++) {
				hours[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours[0].length; j++) {
				sum[i][1] += hours[i][j];
			}
			sum[i][0] = i;
		}
		selectionSort(sum);
		for (int j = sum.length - 1; j >= 0; j--) {
			System.out.println("Employee " + sum[j][0] + "'s hours: " + sum[j][1]);
		}
	}

	public static void selectionSort(int[][] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i][1];
			int index = i;

			for (int j = i + 1; j < list.length; j++) {
				if (min > list[j][1]) {
					min = list[j][1];
					index = j;
				}
			}
			if (index != i) {
				list[index][1] = list[i][1];
				list[i][1] = min;
				list[index][0] = list[i][0];
				list[i][0] = index;
			}

		}
	}
}
