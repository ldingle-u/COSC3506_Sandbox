import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    @Test
    public void testPower() {
        assertEquals(8.0, calc.power(2, 3));
        assertEquals(0.125, calc.power(2, -3));
        assertThrows(ArithmeticException.class, () -> calc.power(0, -1));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, calc.squareRoot(9));
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    @Test
    public void testIsPrime() {
        assertTrue(calc.isPrime(13));
        assertFalse(calc.isPrime(10));
        assertTrue(calc.isPrime(29));
        assertFalse(calc.isPrime(1));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}
