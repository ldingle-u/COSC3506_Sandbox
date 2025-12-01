import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.main.java.AdvancedCalculator;

// Trigger: no-op comment to prompt editor re-index

public class AdvancedCalculatorTests {

    // -------- power tests --------

    @Test
    public void testPowerPositiveExponent() {
        // 2^3 = 8
        double result = AdvancedCalculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        // 2^-3 = 1/8 = 0.125
        double result = AdvancedCalculator.power(2, -3);
        assertEquals(0.125, result, 0.0001);
    }

    @Test
    public void testPowerZeroNegativeExponentThrows() {
        // 0^-1 is invalid, should throw an exception
        assertThrows(ArithmeticException.class, () -> AdvancedCalculator.power(0, -1));
    }

    // -------- squareRoot tests --------

    @Test
    public void testSquareRootPositive() {
        double result = AdvancedCalculator.squareRoot(9);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testSquareRootNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.squareRoot(-4));
    }

    // -------- isPrime tests --------

    @Test
    public void testIsPrimeWithPrimeNumbers() {
        assertTrue(AdvancedCalculator.isPrime(13), "13 should be prime");
        assertTrue(AdvancedCalculator.isPrime(29), "29 should be prime");
    }

    @Test
    public void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(AdvancedCalculator.isPrime(10), "10 should not be prime");
        // 1 is not prime
        assertFalse(AdvancedCalculator.isPrime(1), "1 should not be prime");
    }

    // -------- factorial tests --------

    @Test
    public void testFactorialOfFive() {
        long result = AdvancedCalculator.factorial(5);
        assertEquals(120L, result);
    }

    @Test
    public void testFactorialOfZero() {
        long result = AdvancedCalculator.factorial(0);
        assertEquals(1L, result);
    }

    @Test
    public void testFactorialOfNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.factorial(-3));
    }

    @Test
    public void testFactorialOfTwenty() {
        long result = AdvancedCalculator.factorial(20);
        long expected = 2432902008176640000L;
        assertEquals(expected, result);
    }
}
