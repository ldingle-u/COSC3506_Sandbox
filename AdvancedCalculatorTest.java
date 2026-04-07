import static org.junit.Assert.*;
import org.junit.Test;

public class AdvancedCalculatorTest {

    // ---------------- Power Tests ----------------
    @Test
    public void testPowerPositive() {
        assertEquals(8, AdvancedCalculator.power(2, 3), 0.001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowerZeroNegative() {
        AdvancedCalculator.power(0, -1);
    }

    // ---------------- Square Root Tests ----------------
    @Test
    public void testSquareRootPositive() {
        assertEquals(3, AdvancedCalculator.squareRoot(9), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        AdvancedCalculator.squareRoot(-4);
    }

    // ---------------- IsPrime Tests ----------------
    @Test
    public void testIsPrime() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertFalse(AdvancedCalculator.isPrime(10));
        assertTrue(AdvancedCalculator.isPrime(29));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    // ---------------- Factorial Tests ----------------
    @Test
    public void testFactorialValid() {
        assertEquals(120, AdvancedCalculator.factorial(5));
        assertEquals(1, AdvancedCalculator.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        AdvancedCalculator.factorial(-3);
    }

    @Test
    public void testFactorialLarge() {
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}