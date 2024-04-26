package com.demo.ArrayCalculator;

public class HelperClass {
	
	static int getMinValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// check for negative or zero numbers in an array
	static void checkForNegativeOrZero(int[] arr) throws Exception {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				throw new Exception("Array contains negative number or zero. Use only natural numbers in an array.");
			}
		}

	}

	//count how many numbers fit between different numbers of an array and find the smallest value
	static int countMinAmountOfNumbersBetweenArrValues(int[] arr) throws Exception {

		int[] numbers = arr;
		int[] difference = new int[numbers.length - 1];

		checkForNegativeOrZero(numbers);

		for (int i = 0; i < numbers.length - 1; i++) {

			if (numbers[i] < numbers[i + 1]) {
				difference[i] = (numbers[i + 1] - numbers[i]) - 1;
			} else if (numbers[i] == numbers[i + 1]) {
				difference[i] = 0;
			} else {
				difference[i] = (numbers[i] - numbers[i + 1]) - 1;
			}

		}
		return getMinValue(difference);

	}

}
