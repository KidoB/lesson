package com.lessons;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
	Calculator calculator = new Calculator();
	calculator.add(1, 1);
	assertEquals(2, calculator.getResult());
    }

}
