import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    private final AdvancedCalculator calc = new AdvancedCalculator();

    // Power tests
    @Test
    void testPowerPositive() {
        assertEquals(8, calc.power(2, 3));
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, calc.power(2, -3), 0.0001);
    }

    @Test
    void testPowerZeroNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.power(0, -1));
    }

    // Square root tests
    @Test
    void testSquareRootPositive() {
        assertEquals(3, calc.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    // Prime tests
    @Test
    void testIsPrimeValues() {
        assertTrue(calc.isPrime(13));
        assertFalse(calc.isPrime(10));
        assertTrue(calc.isPrime(29));
        assertFalse(calc.isPrime(1));
    }

    
    @Test
    void testFactorialPositive() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    void testFactorialTwenty() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}
