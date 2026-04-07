package cosc3506;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    // -----------------------------
    // POWER TESTS
    // -----------------------------

    @Test
    public void testPowerPositive() {
        assertEquals(8, calc.power(2, 3));
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, calc.power(2, -3), 0.0001);
    }

    @Test
    public void testPowerZeroNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.power(0, -1);
        });
    }

    // -----------------------------
    // SQUARE ROOT TESTS
    // -----------------------------

    @Test
    public void testSquareRootPositive() {
        assertEquals(3, calc.squareRoot(9), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4);
        });
    }

    // -----------------------------
    // IS PRIME TESTS
    // -----------------------------

    @Test
    public void testIsPrime13() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    public void testIsPrime10() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    public void testIsPrime29() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    public void testIsPrime1() {
        assertFalse(calc.isPrime(1));
    }

    // -----------------------------
    // FACTORIAL TESTS
    // -----------------------------

    @Test
    public void testFactorial5() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    public void testFactorial0() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
    }

    @Test
    public void testFactorial20() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}