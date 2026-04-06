import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    // <<<<<<<<<<<<<<<<<<<< power() >>>>>>>>>>>>>>>>>>>>

    @Test
    void power_withPositiveExponent_eight() {
        assertEquals(8.0, calculator.power(2, 3));
    }

    @Test
    void power_withNegativeExponent_oneOverEight() {
        assertEquals(0.125, calculator.power(2, -3));
    }

    @Test
    void power_withZeroBaseNegativeExponent_throwException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.power(0, -1));
    }

    // <<<<<<<<<<<<<<<<<<<< squareRoot() >>>>>>>>>>>>>>>>>>>>

    @Test
    void squareRoot_positive() {
        assertEquals(3, calculator.squareRoot(9));
    }

    @Test
    void squareRoot_negative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    // <<<<<<<<<<<<<<<<<<<< isPrime() >>>>>>>>>>>>>>>>>>>>

    @Test
    void isPrime_13() {
        assertTrue(calculator.isPrime(13));
    }

    @Test
    void isPrime_10() {
        assertFalse(calculator.isPrime(10));
    }

    @Test
    void isPrime_29() {
        assertTrue(calculator.isPrime(29));
    }

    @Test
    void isPrime_1() {
        assertFalse(calculator.isPrime(1));
    }

    // <<<<<<<<<<<<<<<<<<<< factorial() >>>>>>>>>>>>>>>>>>>>

    @Test
    void factorial_5() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void factorial_0() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void factorial_negative3() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
    }

    @Test
    void factorial_20() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(20));
    }

}
