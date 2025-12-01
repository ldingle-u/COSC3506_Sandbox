import org.junit.Test;
import static org.junit.Assert.*;

// Trigger: no-op comment to prompt editor re-index

public class AdvancedCalculatorTest {

    // -------- power tests --------

    @Test
    public void testPowerPositiveExponent() {
        // 2^3 = 8
        double result = AdvancedCalculator.power(2, 3);
        assertEquals("2^3 should be 8", 8.0, result, 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        // 2^-3 = 1/8 = 0.125
        double result = AdvancedCalculator.power(2, -3);
        assertEquals("2^-3 should be 0.125", 0.125, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testPowerZeroNegativeExponentThrows() {
        // 0^-1 is invalid, should throw an exception
        AdvancedCalculator.power(0, -1);
    }

    // -------- squareRoot tests --------

    @Test
    public void testSquareRootPositive() {
        double result = AdvancedCalculator.squareRoot(9);
        assertEquals("sqrt(9) should be 3", 3.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegativeThrows() {
        AdvancedCalculator.squareRoot(-4);
    }

    // -------- isPrime tests --------

    @Test
    public void testIsPrimeWithPrimeNumbers() {
        assertTrue("13 should be prime", AdvancedCalculator.isPrime(13));
        assertTrue("29 should be prime", AdvancedCalculator.isPrime(29));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumbers() {
        assertFalse("10 should not be prime", AdvancedCalculator.isPrime(10));
        // 1 is not prime
        assertFalse("1 should not be prime", AdvancedCalculator.isPrime(1));
    }

    // -------- factorial tests --------

    @Test
    public void testFactorialOfFive() {
        long result = AdvancedCalculator.factorial(5);
        assertEquals("5! should be 120", 120L, result);
    }

    @Test
    public void testFactorialOfZero() {
        long result = AdvancedCalculator.factorial(0);
        assertEquals("0! should be 1", 1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeThrows() {
        AdvancedCalculator.factorial(-3);
    }

    @Test
    public void testFactorialOfTwenty() {
        long result = AdvancedCalculator.factorial(20);
        long expected = 2432902008176640000L;
        assertEquals("20! should match expected value", expected, result);
    }
}
