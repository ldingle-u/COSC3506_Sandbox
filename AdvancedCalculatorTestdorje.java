import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTestdorje {

    @Test
    public void testPowerPositiveExponent() {
        assertEquals(8.0, AdvancedCalculator.power(2, 3));
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3));
    }

    @Test
    public void testPowerZeroBaseNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> {
            AdvancedCalculator.power(0, -1);
        });
    }

    @Test
    public void testSquareRootPositive() {
        assertEquals(3.0, AdvancedCalculator.squareRoot(9));
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.squareRoot(-4);
        });
    }

    @Test
    public void testIsPrimeWithPrime() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertTrue(AdvancedCalculator.isPrime(29));
    }

    @Test
    public void testIsPrimeWithNonPrime() {
        assertFalse(AdvancedCalculator.isPrime(10));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    @Test
    public void testFactorialValid() {
        assertEquals(120, AdvancedCalculator.factorial(5));
        assertEquals(1, AdvancedCalculator.factorial(0));
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.factorial(-3);
        });
    }
}
