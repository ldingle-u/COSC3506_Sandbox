import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    @Test
    void power_positive() {
        assertEquals(8.0, calc.power(2,3), 1e-9);
    }

    @Test
    void power_negative() {
        assertEquals(0.125, calc.power(2,-3), 1e-9);
    }

    @Test
    void power_zero_negative_shouldThrow() {
        assertThrows(ArithmeticException.class, () -> calc.power(0,-1));
    }

    @Test
    void sqrt_positive() {
        assertEquals(3.0, calc.squareRoot(9), 1e-9);
    }

    @Test
    void sqrt_negative_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    @Test
    void isPrime_cases() {
        assertTrue(calc.isPrime(13));
        assertFalse(calc.isPrime(10));
        assertTrue(calc.isPrime(29));
        assertFalse(calc.isPrime(1));
    }

    @Test
    void factorial_positive() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void factorial_zero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void factorial_negative_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    void factorial_20_largeValue() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}
