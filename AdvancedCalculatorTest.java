import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3), 0.001);
        assertEquals(0.125, calculator.power(2, -3), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.power(0, -1));
    }

    @Test
    void testSquareRoot() {
        assertEquals(3, calculator.squareRoot(9), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    @Test
    void testIsPrime() {
        assertTrue(calculator.isPrime(13));
        assertFalse(calculator.isPrime(10));
        assertTrue(calculator.isPrime(29));
        assertFalse(calculator.isPrime(1));
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
        assertEquals(2432902008176640000L, calculator.factorial(20)); // Verify large result
    }
}
