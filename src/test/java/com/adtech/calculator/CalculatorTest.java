package com.adtech.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {


    @Test
    public void success() {
        Calculator calculator = new Calculator(1, 1);
        assert calculator.divide() == 2;
    }

    @Test
    public void positive2() {
        Calculator calculator = new Calculator(2, 2);
        assert calculator.divide() == 1;
    }

    @Test
    public void negative() {
        Calculator calculator = new Calculator(2, 0);
        assertThrows(AssertionError.class, ()->{
            assert calculator.divide() == 1;
        });
    }

}
