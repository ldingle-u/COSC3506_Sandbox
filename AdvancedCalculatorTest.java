import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    @Test
    public void testPower() {
        assertEquals(8, AdvancedCalculator.power(2, 3));
        assertEquals(0.125, AdvancedCalculator.power(2, -3));
        assertThrows(ArithmeticException.class, () -> AdvancedCalculator.power(0, -1));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3, AdvancedCalculator.squareRoot(9));
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.squareRoot(-4));
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
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.factorial(-3));
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}
