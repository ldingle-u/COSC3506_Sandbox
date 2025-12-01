import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    // Power tests
    @Test
    void testPowerPositive() {
        assertEquals(8, AdvancedCalculator.power(2, 3));
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3), 0.0001);
    }

    @Test
    void testPowerZeroNegative() {
        try {
            AdvancedCalculator.power(0, -1);
            fail("Expected ArithmeticException not thrown");
        } catch (ArithmeticException e) {}
    }

    // Square root tests
    @Test
    void testSquareRootPositive() {
        assertEquals(3, AdvancedCalculator.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootNegative() {
        try {
            AdvancedCalculator.squareRoot(-4);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {}
    }

    // Prime number tests
    @Test
    void testIsPrime() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertFalse(AdvancedCalculator.isPrime(10));
        assertTrue(AdvancedCalculator.isPrime(29));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    // Factorial tests
    @Test
    void testFactorialPositive() {
        assertEquals(120, AdvancedCalculator.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, AdvancedCalculator.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        try {
            AdvancedCalculator.factorial(-3);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {}
    }

    @Test
    void testFactorialLarge() {
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}
