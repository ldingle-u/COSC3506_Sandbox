import static org.junit.Assert.*;
import org.junit.Test;

public class AdvancedCalculatorTestHS {

    @Test
    public void testPower() {
        // 2^3 = 8
        assertEquals(8.0, AdvancedCalculator.power(2, 3), 0.0001);

        // 2^-3 = 0.125
        assertEquals(0.125, AdvancedCalculator.power(2, -3), 0.0001);

        // 0^-1 should throw ArithmeticException
        try {
            AdvancedCalculator.power(0, -1);
            fail("Expected ArithmeticException for 0^-1");
        } catch (ArithmeticException e) {
            // pass
        }
    }


    @Test
    public void testSquareRoot() {
        assertEquals(3, AdvancedCalculator.squareRoot(9), 0.0001);

        try {
            AdvancedCalculator.squareRoot(-4);
            fail("Expected IllegalArgumentException for squareRoot(-4)");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testIsPrime() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertFalse(AdvancedCalculator.isPrime(10));
        assertTrue(AdvancedCalculator.isPrime(29));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, AdvancedCalculator.factorial(5));
        assertEquals(1, AdvancedCalculator.factorial(0));

        try {
            AdvancedCalculator.factorial(-3);
            fail("Expected IllegalArgumentException for factorial(-3)");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}