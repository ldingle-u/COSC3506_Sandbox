// Assignment 4
// SAUMIL SHEKH
// COSC3506 - TESTING

package src.test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import src.main.java.AdvancedCalculator;

public class AdvancedCalculatorTest {

    // ---------- power() tests ----------

    @Test
    public void testPowerPositiveExponent() {
        double result = AdvancedCalculator.power(2, 3); 
        assertEquals(8.0, result, 1e-9);
    }

    @Test
    public void testPowerNegativeExponent() {
        double result = AdvancedCalculator.power(2, -3);
        assertEquals(0.125, result, 1e-9);
    }

    @Test(expected = ArithmeticException.class)
    public void testPowerZeroBaseNegativeExponentThrows() {
        AdvancedCalculator.power(0, -1); 
    }

    // ---------- squareRoot() tests ----------

    @Test
    public void testSquareRootPositive() {
        double result = AdvancedCalculator.squareRoot(9);
        assertEquals(3.0, result, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegativeThrows() {
        AdvancedCalculator.squareRoot(-4);
    }

    // ---------- isPrime() tests ----------

    @Test
    public void testIsPrimeValues() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertFalse(AdvancedCalculator.isPrime(10));
        assertTrue(AdvancedCalculator.isPrime(29));
        assertFalse(AdvancedCalculator.isPrime(1)); // 1 is not prime
    }

    // ---------- factorial() tests ----------

    @Test
    public void testFactorial5() {
        long result = AdvancedCalculator.factorial(5);
        assertEquals(120L, result);
    }

    @Test
    public void testFactorial0() {
        long result = AdvancedCalculator.factorial(0);
        assertEquals(1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeThrows() {
        AdvancedCalculator.factorial(-3);
    }

    @Test
    public void testFactorial20() {
        long result = AdvancedCalculator.factorial(20);
        assertEquals(2432902008176640000L, result);
    }
}
