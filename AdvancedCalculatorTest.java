import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();


    @Test
    void poweredPositiveNumbers() {
        assertEquals(8.0, calc.power(2,3));
    }

    @Test
    void poweredNegativeNumbers() {
        assertEquals(0.125, calc.power(2,-3));
    }

    @Test
    void poweredZeroNegative() {
        assertThrows(IllegalArgumentException.class, () ->calc.power(0,-1));
    }

    @Test
    void squareRootPositive() {
        assertEquals(3, calc.squareRoot(9));
    }

    @Test
    void squareRootNegative() {
        assertThrows(IllegalArgumentException.class, () ->calc.squareRoot(-4));
    }

    @Test
    void isPrime1() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    void isPrime2() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    void isPrime3() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    void isPrime4() {
        assertFalse(calc.isPrime(1));
    }

    @Test
    void factorial1() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void factorial2() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void factorial3() {
        assertThrows(IllegalArgumentException.class, () ->calc.factorial(-3));
    }

    @Test
    void factorial4() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}