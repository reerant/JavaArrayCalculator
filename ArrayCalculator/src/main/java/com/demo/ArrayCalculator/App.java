package com.demo.ArrayCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter natural number:");
			numbers[i] = input.nextInt();
		}

		input.close();

		int difference = HelperClass.countMinAmountOfNumbersBetweenArrValues(numbers);
		System.out.println("In an array " + Arrays.toString(numbers)
				+ " the smallest amount of numbers between array numbers is: " + difference);
	}

}
