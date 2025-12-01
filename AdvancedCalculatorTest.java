package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

  
    @Test
    void testPower_PositiveExponent() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001, "2^3 should be 8.0");
    }

    @Test
    void testPower_NegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001, "2^-3 should be 0.125");
    }

  
    @Test
    void testPower_ZeroToNegativePower_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.power(0, -1);
        }, "0 raised to a negative power must throw IllegalArgumentException.");
    }


   
    @Test
    void testSquareRoot_PositiveInput() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001, "Square root of 9 should be 3.0");
    }

    /**
     * Requirement 4.b.i: Test to ensure sqrt(-4) throws an exception.
     */
    @Test
    void testSquareRoot_NegativeInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        }, "Square root of a negative number must throw IllegalArgumentException.");
    }


    
    @Test
    void testIsPrime_TrueCase_13() {
        assertTrue(calculator.isPrime(13), "13 is a prime number.");
    }

    @Test
    void testIsPrime_FalseCase_10() {
        assertFalse(calculator.isPrime(10), "10 is not prime.");
    }

    @Test
    void testIsPrime_TrueCase_29() {
        assertTrue(calculator.isPrime(29), "29 is a prime number.");
    }

    @Test
    void testIsPrime_EdgeCase_1() {
        assertFalse(calculator.isPrime(1), "1 is not considered prime (by mathematical definition).");
    }


    @Test
    void testFactorial_PositiveInput_5() {
        assertEquals(120L, calculator.factorial(5), "5! should equal 120");
    }

    @Test
    void testFactorial_BaseCase_0() {
        assertEquals(1L, calculator.factorial(0), "0! should equal 1");
    }

  
    @Test
    void testFactorial_NegativeInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        }, "Factorial of a negative number must throw IllegalArgumentException.");
    }


    @Test
    void testFactorial_LargeInput_20() {

        long expected = 2432902008176640000L; 
        assertEquals(expected, calculator.factorial(20), "20! should equal the correct long value.");
    }
}