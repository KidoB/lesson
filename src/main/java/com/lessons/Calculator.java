package com.lessons;

public class Calculator {
	private int result;

	/**
	 * We calculate the sum of the arguments.
	 * 
	 * @param params
	 *            - Arguments of addition.
	 */
	public void add(int... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/**
	 * Get the result.
	 * 
	 * @return The result of the calculation.
	 */
	public int getResult() {
		return this.result;
	}

	/**
	 * Clear the result of the calculations
	 */
	public void cleanResult() {
		this.result = 0;
	}
}
