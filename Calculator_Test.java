package com.stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import stringCalculatorTDD.Calculator;

public class CalculatorTest {
	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void shouldReturnNumberOnSingleString() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void shouldReturnSumOfNumbersOnTwoStrings() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void shouldReturnSumOfAllNumbers() {
		assertEquals(6,Calculator.add("1,2,3"));
	}
	
	}
}