import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calc = new AdvancedCalculator();

    // ---------- Power tests ----------
    @Test
    @DisplayName("Power: positive exponent")
    void testPowerPositive() {
        assertEquals(8, calc.power(2, 3));
    }

    @Test
    @DisplayName("Power: negative exponent (returns double)")
    void testPowerNegativeExponent() {
        assertEquals(0.125, calc.power(2, -3), 1e-9);
    }

    @Test
    @DisplayName("Power: base zero with negative exponent -> ArithmeticException")
    void testPowerZeroNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> calc.power(0, -1));
    }

    // ---------- SquareRoot tests ----------
    @Test
    @DisplayName("SquareRoot: positive number")
    void testSqrtPositive() {
        assertEquals(3.0, calc.squareRoot(9), 1e-9);
    }

    @Test
    @DisplayName("SquareRoot: negative number throws IllegalArgumentException")
    void testSqrtNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    // ---------- IsPrime tests ----------
    @Test
    @DisplayName("IsPrime: 13 is prime")
    void testIsPrimeTrue() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    @DisplayName("IsPrime: 10 is not prime")
    void testIsPrimeFalse() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    @DisplayName("IsPrime: 29 is prime")
    void testIsPrimeTrue2() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    @DisplayName("IsPrime: 1 is not prime")
    void testIsPrimeOne() {
        assertFalse(calc.isPrime(1));
    }

    // ---------- Factorial tests ----------
    @Test
    @DisplayName("Factorial: 5! = 120")
    void testFactorialFive() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    @DisplayName("Factorial: 0! = 1")
    void testFactorialZero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    @DisplayName("Factorial: negative number throws IllegalArgumentException")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    @DisplayName("Factorial: 20! does not overflow (within long range)")
    void testFactorialTwenty() {
        long expected = 2432902008176640000L; // 20!
        assertEquals(expected, calc.factorial(20));
    }
}