import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    @Test
    public void testPower() {
        assertEquals(8, new AdvancedCalculator().power(2, 3));
        assertEquals(0.125, new AdvancedCalculator().power(2, -3), 0.0001);
        assertThrows(ArithmeticException.class, () -> new AdvancedCalculator().power(0, -1));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3, new AdvancedCalculator().squareRoot(9));
        assertThrows(IllegalArgumentException.class, () -> new AdvancedCalculator().squareRoot(-4));
    }

    @Test
    public void testIsPrime() {
        assertTrue(new AdvancedCalculator().isPrime(13));
        assertFalse(new AdvancedCalculator().isPrime(10));
        assertTrue(new AdvancedCalculator().isPrime(29));
        assertFalse(new AdvancedCalculator().isPrime(1));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, new AdvancedCalculator().factorial(5));
        assertEquals(1, new AdvancedCalculator().factorial(0));
        assertThrows(IllegalArgumentException.class, () -> new AdvancedCalculator().factorial(-3));
        assertEquals(2432902008176640000L, new AdvancedCalculator().factorial(20));
    }
}
