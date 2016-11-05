package javaintro;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayMethods {
	

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = (int)(Math.random()*(1000 - 1)) + 1;
		array[1] = (int)(Math.random()*(1000 - 1)) + 1;
		array[2] = (int)(Math.random()*(1000 - 1)) + 1;
		array[3] = (int)(Math.random()*(1000 - 1)) + 1;
		array[4] = (int)(Math.random()*(1000 - 1)) + 1;
		System.out.println("The values in array are: " + Arrays.toString(array));
		System.out.println("The maximum value is: " + arrayMax(array));
		System.out.println("The minimum value is: " + arrayMin(array));
		System.out.println("The values squared are: ");
		arraySquared(array);
		System.out.println("\n");
		System.out.println("The array reversed is: ");
		arrayReverse(array);
		// TODO Auto-generated method stub

	}
	public static int arrayMax (int[] arr) {
		int max = 0;
		for (int i =0; i < arr.length; i++) {
			if (arr [i] > max) {
				max = arr [i];
			}
			
		}
		return max;
	}
	public static int arrayMin (int[] arr) {
		int min = 1000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
				
		}
		return min;
	}
	public static void arraySquared(int[] arr) {
		int [] arr2 = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] * arr[i];
			System.out.print(arr2[i]);
			while(i < arr.length - 1){
				System.out.print(", ");
				break;
			}
		}
	}
	public static void arrayReverse (int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
