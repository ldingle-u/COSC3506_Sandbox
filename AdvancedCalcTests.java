import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2, 3));
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.power(0, -1));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    @Test
    public void testIsPrime() {
        assertTrue(calculator.isPrime(13));
        assertFalse(calculator.isPrime(10));
        assertTrue(calculator.isPrime(29));
        assertFalse(calculator.isPrime(1));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
        assertThrows(ArithmeticException.class, () -> calculator.factorial(21)); // Test for overflow
    }
}
