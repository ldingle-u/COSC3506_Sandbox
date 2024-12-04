import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    void testPower() { // Test for the power

        assertEquals(8.0, calculator.power(2, 3), 0.001);

        assertEquals(0.125, calculator.power(2, -3), 0.001);

        assertThrows(ArithmeticException.class, () -> calculator.power(0, -1));
    }

    @Test
    void testSquareRoot() {// Test Square root

        assertEquals(3.0, calculator.squareRoot(9), 0.001);

        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    @Test
    void testIsPrime() {
        // Test some prime numbers
        assertTrue(calculator.isPrime(13));
        assertTrue(calculator.isPrime(29));

        // Test some non-prime numbers
        assertFalse(calculator.isPrime(10));
        assertFalse(calculator.isPrime(1)); // 1 is not prime
    }

    @Test
    void testFactorial() {
        // Test factorial of 5 = 120
        assertEquals(120, calculator.factorial(5));

        // Test factorial of 0 = 1
        assertEquals(1, calculator.factorial(0));

        // Test factorial of -3
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));

        // Test factorial of 20
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}
