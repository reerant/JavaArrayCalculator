package com.demo.ArrayCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void ExceptionNegative() throws Exception {
		int[] testArr = { 8, -1, 10 };
		thrown.expect(Exception.class);
		thrown.expectMessage("Array contains negative number or zero. Use only natural numbers in an array.");
		HelperClass.checkForNegativeOrZero(testArr);

	}

	@Test
	public void ExceptionZero() throws Exception {
		int[] testArr = { 7, 4, 0 };
		thrown.expect(Exception.class);
		thrown.expectMessage("Array contains negative number or zero. Use only natural numbers in an array.");
		HelperClass.checkForNegativeOrZero(testArr);

	}

	@Test
	public void NaturalOrder() throws Exception {
		int[] testArr = { 1, 4, 10 };
		assertEquals(2, HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr));
	}

	@Test
	public void DifferentOrder() throws Exception {
		int[] testArr = { 10, 4, 1 };
		assertEquals(2, HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr));
	}

	@Test
	public void ManySameNumbers() throws Exception {
		int[] testArr = { 1, 1, 1 };
		assertEquals(0, HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr));
	}

	@Test
	public void ManyNumbersHaveSameDifference() throws Exception {
		int[] testArr = { 1, 4, 7 };
		assertEquals(2, HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr));
	}

}
