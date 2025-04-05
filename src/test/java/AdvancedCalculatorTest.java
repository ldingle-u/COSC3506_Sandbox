import static org.junit.Assert.*;
import org.junit.Test;

public class AdvancedCalculatorTest {

    // Power method tests
    @Test
    public void testPowerPositiveExponent() {
        assertEquals(8.0, AdvancedCalculator.power(2, 3), 0.001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testPowerZeroNegativeExponent() {
        AdvancedCalculator.power(0, -1);
    }

    // SquareRoot tests
    @Test
    public void testSquareRootValid() {
        assertEquals(3.0, AdvancedCalculator.squareRoot(9), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        AdvancedCalculator.squareRoot(-4);
    }

    // IsPrime tests
    @Test
    public void testIsPrimeWithPrimes() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertTrue(AdvancedCalculator.isPrime(29));
    }

    @Test
    public void testIsPrimeWithNonPrimes() {
        assertFalse(AdvancedCalculator.isPrime(10));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    // Factorial tests (using long)
    @Test
    public void testFactorialNormal() {
        assertEquals(120L, AdvancedCalculator.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1L, AdvancedCalculator.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        AdvancedCalculator.factorial(-3);
    }

    @Test
    public void testFactorialBoundaryCase() {
        // Testing 20! with original long implementation
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}