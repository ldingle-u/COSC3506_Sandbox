import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    @Test
    void testPowerPositive() {
        assertEquals(8.0, AdvancedCalculator.power(2, 3));
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3));
    }

    @Test
    void testPowerZeroNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> {
            AdvancedCalculator.power(0, -1);
        });
    }

    @Test
    void testSquareRootValid() {
        assertEquals(3.0, AdvancedCalculator.squareRoot(9));
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.squareRoot(-4);
        });
    }

    @Test
    void testIsPrimeValues() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertFalse(AdvancedCalculator.isPrime(10));
        assertTrue(AdvancedCalculator.isPrime(29));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    @Test
    void testFactorialValues() {
        assertEquals(120, AdvancedCalculator.factorial(5));
        assertEquals(1, AdvancedCalculator.factorial(0));
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.factorial(-3);
        });
    }
}
