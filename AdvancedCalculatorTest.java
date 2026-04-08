import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    // -------------------- Power Tests --------------------

    @Test
    void testPowerPositive() {
        assertEquals(8.0, calc.power(2, 3), 0.0001);
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, calc.power(2, -3), 0.0001);
    }

    @Test
    void testPowerException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.power(0, -1);
        });
    }

    // -------------------- SquareRoot Tests --------------------

    @Test
    void testSquareRootValid() {
        assertEquals(3.0, calc.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4);
        });
    }

    // -------------------- IsPrime Tests --------------------

    @Test
    void testIsPrime13() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    void testIsPrime10() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    void testIsPrime29() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    void testIsPrime1() {
        assertFalse(calc.isPrime(1));
    }

    // -------------------- Factorial Tests --------------------

    @Test
    void testFactorial5() {
        assertEquals(120L, calc.factorial(5));
    }

    @Test
    void testFactorial0() {
        assertEquals(1L, calc.factorial(0));
    }

    @Test
    void testFactorialException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
    }

    @Test
    void testFactorial20() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}