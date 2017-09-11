package com.lessons;

import java.util.Scanner;

/**
 * Class to run calculator. Supports user input
 */
public class InteractRunner {

    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);

	try {
	    Calculator calc = new Calculator();
	    String exit = "no";

	    while (!exit.equals("yes")) {
		System.out.println("Enter your first arg: ");
		String first = reader.next();
		System.out.println("Enter your second arg: ");
		String second = reader.next();
		calc.add(Integer.valueOf(first), Integer.valueOf(second));
		System.out.println("Result: " + calc.getResult());
		calc.cleanResult();
		System.out.println("Exit: yes/no");
		exit = reader.next();
	    }
	} finally {
	    reader.close();
	}
    }
}