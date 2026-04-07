import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    // -------- POWER TEST --------
    @Test
    void testPower() {
        assertEquals(8, calc.power(2, 3));
        assertEquals(0.125, calc.power(2, -3));

        assertThrows(IllegalArgumentException.class, () -> {
            calc.power(0, -1);
        });
    }

    // -------- SQUARE ROOT TEST --------
    @Test
    void testSquareRoot() {
        assertEquals(3, calc.squareRoot(9));

        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4);
        });
    }

    // -------- PRIME TEST --------
    @Test
    void testIsPrime() {
        assertTrue(calc.isPrime(13));
        assertFalse(calc.isPrime(10));
        assertTrue(calc.isPrime(29));
        assertFalse(calc.isPrime(1));
    }

    // -------- FACTORIAL TEST --------
    @Test
    void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));

        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });

        long result = calc.factorial(20);
        assertTrue(result > 0);
    }
}