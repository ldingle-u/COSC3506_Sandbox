import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    // =========================
    // POWER TESTS
    // =========================
    @Test
    void testPowerPositive() {
        assertEquals(8, calc.power(2, 3));
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, calc.power(2, -3));
    }

    @Test
    void testPowerZeroNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.power(0, -1);
        });
    }

    // =========================
    // SQUARE ROOT TESTS
    // =========================
    @Test
    void testSquareRootPositive() {
        assertEquals(3, calc.squareRoot(9));
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4);
        });
    }

    // =========================
    // PRIME TESTS
    // =========================
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

    // =========================
    // FACTORIAL TESTS
    // =========================
    @Test
    void testFactorial5() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void testFactorial0() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
    }

    @Test
    void testFactorial20() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}
