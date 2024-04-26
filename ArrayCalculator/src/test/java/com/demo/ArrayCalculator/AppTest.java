package com.demo.ArrayCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

	@Test(expected = Exception.class)
	public void ExceptionZero() throws Exception {
		try {
			int[] testArr = { 0, 4, 10 };
			HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr);
		} catch (Exception e) {
			String message = "Array contains negative number or zero. Use only natural numbers in an array.";
			assertEquals(message, e.getMessage());
			throw e;
		}
	};
	
	@Test(expected = Exception.class)
	public void ExceptionNegativeNumber() throws Exception {
		try {
			int[] testArr = { 8, -4, 10 };
			HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr);
		} catch (Exception e) {
			String message = "Array contains negative number or zero. Use only natural numbers in an array.";
			assertEquals(message, e.getMessage());
			throw e;
		}
	};

	@Test
	public void NaturalOrder() throws Exception {
		int[] testArr = { 1, 4, 10 };
		assertEquals(2, HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr));
	}

	@Test
	public void DifferentOrder() throws Exception {
		int[] testArr = { 4, 10, 1 };
		assertEquals(5, HelperClass.countMinAmountOfNumbersBetweenArrValues(testArr));
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
