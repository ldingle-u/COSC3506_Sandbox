import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    @Test
    public void testPowerPositiveExponent() {
        assertEquals(8, new AdvancedCalculator().power(2, 3));
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, new AdvancedCalculator().power(2, -3), 0.0001);
    }

    @Test
    public void testPowerZeroNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> {
            new AdvancedCalculator().power(0, -1);
        });
    }

    @Test
    public void testSquareRootPositive() {
        assertEquals(3, new AdvancedCalculator().squareRoot(9));
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new AdvancedCalculator().squareRoot(-4);
        });
    }

    @Test
    public void testIsPrime() {
        assertTrue(new AdvancedCalculator().isPrime(13));
        assertFalse(new AdvancedCalculator().isPrime(10));
        assertTrue(new AdvancedCalculator().isPrime(29));
        assertFalse(new AdvancedCalculator().isPrime(1));
    }

    @Test
    public void testFactorialNormal() {
        assertEquals(120, new AdvancedCalculator().factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, new AdvancedCalculator().factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new AdvancedCalculator().factorial(-3);
        });
    }

    @Test
    public void testFactorialLarge() {
        assertEquals(2432902008176640000L, new AdvancedCalculator().factorial(20));
    }
}
