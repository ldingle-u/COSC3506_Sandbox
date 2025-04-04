package testingproject;

import org.junit.Before; 
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Testing {
    private final AdvancedCalculator calculator = new AdvancedCalculator();

    //  testing power methods
    @Test
    public void testPowerPositiveExponent() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }
//have also added new exception for this case in oue calculator class
    @Test(expected = IllegalArgumentException.class)
    public void testPowerZeroBaseNegativeExponent() {
        calculator.power(0, -1);
    }

    //Testing SquareRoot method
    @Test
    public void testSquareRootPositiveNumber() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegativeNumber() {
        calculator.squareRoot(-4);
    }

    //  Testing IsPrime methods
    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(calculator.isPrime(13));
        assertTrue(calculator.isPrime(29));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(calculator.isPrime(10));
    }

    @Test
    public void testIsPrimeWithOne() {
        assertFalse(calculator.isPrime(1));
    }

    //  Testing Factorial methods
    @Test
    public void testFactorialWithPositiveNumber() {
        assertEquals(120L, calculator.factorial(5));
    }

    @Test
    public void testFactorialWithZero() {
        assertEquals(1L, calculator.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        calculator.factorial(-3);
    }
//since BigInteger was used 20! should not be the problem now
    @Test
    public void testFactorialWithLargeNumber() {
        // 20! = 2432902008176640000
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }

}