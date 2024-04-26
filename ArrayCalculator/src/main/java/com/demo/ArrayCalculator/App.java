package com.demo.ArrayCalculator;

import java.util.Arrays;

public class App {

	public static void main(String[] args) throws Exception {

		int[] numbers = { 1, 4, 10};
		int difference = HelperClass.countMinAmountOfNumbersBetweenArrValues(numbers);
		System.out.println("In an array " + Arrays.toString(numbers) + " the smallest amount of numbers between array numbers is: " + difference);
	}

}
