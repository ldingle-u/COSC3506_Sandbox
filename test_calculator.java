import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class test_calculator {
    private AdvancedCalculator advancedCalculator;

    @Before
    public void setUp() {
        advancedCalculator = new AdvancedCalculator();
    }

    @Test
    public void testPower() {
        double result = advancedCalculator.power(2, 3);
        assertEquals("2 to the power of 3 should equal 8", 8.0, result, 0);
    }

    @Test
    public void testPowerNegative() {
        double result = advancedCalculator.power(2, -3);
        assertEquals("2 to the power of -3 should equal 0.125", 0.125, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowerZero() {
        double result = advancedCalculator.power(0, -1);
    }

    @Test
    public void testSquareRoot() {
        double result = advancedCalculator.squareRoot(9);
        assertEquals("Square root of 9 should be 3", 3, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSquareRoot() {
        double result = advancedCalculator.squareRoot(-4);
    }

    @Test
    public void testisPrime() {
        boolean result = advancedCalculator.isPrime(13);
        assertTrue(result);
    }

    @Test
    public void testisnotPrime() {
        boolean result = advancedCalculator.isPrime(10);
        assertFalse(result);
    }

    @Test
    public void testis29prime() {
        boolean result = advancedCalculator.isPrime(29);
        assertTrue(result);
    }

    @Test
    public void testFactorial() {
        long result = advancedCalculator.factorial(5);
        assertEquals("Factorial of 5 should be 120", 120, result);
    }

    @Test
    public void testFactorialZero() {
        long result = advancedCalculator.factorial(0);
        assertEquals("Factorial of 0 should be 1", 1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        long result = advancedCalculator.factorial(-3);
    }

    @Test
    public void testFactorial20() {
        long result = advancedCalculator.factorial(20);
        assertEquals("", 2432902008176640000L, result);
    }
}
