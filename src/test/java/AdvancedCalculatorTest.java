import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new AdvancedCalculator();
    }

    // -------- power tests --------
    @Test
    void testPowerPositiveExponent() {
        assertEquals(8.0, calc.power(2, 3), 0.0001);
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, calc.power(2, -3), 0.0001);
    }

    @Test
    void testPowerZeroNegativeExponentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.power(0, -1));
    }

    // -------- squareRoot tests --------
    @Test
    void testSquareRootPositive() {
        assertEquals(3.0, calc.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    // -------- isPrime tests --------
    @Test
    void testIsPrimeWith13() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    void testIsPrimeWith10() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    void testIsPrimeWith29() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    void testIsPrimeWith1() {
        assertFalse(calc.isPrime(1));
    }

    // Extra test to expose the bug in current code
    @Test
    void testIsPrimeWithPerfectSquare() {
        assertFalse(calc.isPrime(9));
    }

    // -------- factorial tests --------
    @Test
    void testFactorialOf5() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void testFactorialOf0() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    void testFactorialOf20() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}
