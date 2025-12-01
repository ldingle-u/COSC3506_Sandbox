import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {


    @Test
    void testPowerPositive() {
        assertEquals(8, AdvancedCalculator.power(2, 3), 0.0001);
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3), 0.0001);
    }

    @Test
    void testPowerZeroNegative() {
        assertThrows(ArithmeticException.class, () -> AdvancedCalculator.power(0, -1));
    }

    @Test
    void testSquareRootPositive() {
        assertEquals(3, AdvancedCalculator.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.squareRoot(-4));
    }

    @Test
    void testIsPrime() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertFalse(AdvancedCalculator.isPrime(10));
        assertTrue(AdvancedCalculator.isPrime(29));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

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
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.factorial(-3));
    }

    @Test
    void testFactorialLarge() {
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}
