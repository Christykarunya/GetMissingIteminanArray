package week1.day2;

import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {
		// Initialize the array- input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		System.out.println("Default array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// sorting array
		Arrays.sort(arr);
		System.out.println("Sorted array");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
		// loop through the array
		for (int i = 0; i < arr.length; i++) {
			// check if iterator variable is not equal to array values respectively
			if (arr[i]+1 != arr[i+1]) {
				// print the number
				System.out.println("Missing element in the array:" + (arr[i]+1));
				// once printed break the iteration
				break;

			}

		}

	}

}
