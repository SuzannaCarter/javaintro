package javaintro;

import java.util.Scanner;

public class IdenticalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		System.out.println("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for(int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		if(equals(list1, list2)) {
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}

	}
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		
		
		for (int i = 0; i < list2.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}
}
		
		
		/*selectionSort(list1);
		selectionSort(list2);
		
		for (int i = 0; i < list2.length; i++) {
			if (list1[i] != list2[i])
				return false;
			
		}
		return true;
		
	}
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex =i;
			for(int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}*/
