import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AdvancedCalculatorTest {

    @Test
    void testPower_positiveExponent() {
        double result = AdvancedCalculator.power(2, 3);
        assertEquals(8.0, result, 1e-9);
    }

    @Test
    void testPower_negativeExponent() {
        double result = AdvancedCalculator.power(2, -3);
        assertEquals(0.125, result, 1e-9);
    }

    @Test
    void testPower_zeroNegativeExponent_throws() {
        assertThrows(
            ArithmeticException.class,
            () -> AdvancedCalculator.power(0, -1)
        );
    }

    @Test
    void testSquareRoot_positiveNumber() {
        double result = AdvancedCalculator.squareRoot(9.0);
        assertEquals(3.0, result, 1e-9);
    }

    @Test
    void testSquareRoot_negativeNumber_throws() {
        assertThrows(
            IllegalArgumentException.class,
            () -> AdvancedCalculator.squareRoot(-4.0)
        );
    }

    @Test
    void testIsPrime_13_isPrime() {
        assertTrue(AdvancedCalculator.isPrime(13));
    }

    @Test
    void testIsPrime_10_notPrime() {
        assertFalse(AdvancedCalculator.isPrime(10));
    }

    @Test
    void testIsPrime_29_isPrime() {
        assertTrue(AdvancedCalculator.isPrime(29));
    }

    @Test
    void testIsPrime_1_notPrime() {
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    @Test
    void testFactorial_5() {
        assertEquals(120L, AdvancedCalculator.factorial(5));
    }

    @Test
    void testFactorial_0() {
        assertEquals(1L, AdvancedCalculator.factorial(0));
    }

    @Test
    void testFactorial_negative_throws() {
        assertThrows(
            IllegalArgumentException.class,
            () -> AdvancedCalculator.factorial(-3)
        );
    }

    @Test
    void testFactorial_20() {
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }
}

