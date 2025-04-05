package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    @Test
    public void testPower() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        // Test positive exponent
        assertEquals(8.0, calculator.power(2, 3), 0.001);

        // Test negative exponent
        assertEquals(0.125, calculator.power(2, -3), 0.001);

        // Test 0 raised to a negative power (expecting an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.power(0, -1);
        });
    }

    @Test
    public void testSquareRoot() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        // Test positive input
        assertEquals(3.0, calculator.squareRoot(9), 0.001);

        // Test negative input (expecting an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        });
    }

    @Test
    public void testIsPrime() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        // Test prime numbers
        assertTrue(calculator.isPrime(13));
        assertTrue(calculator.isPrime(29));

        // Test non-prime numbers
        assertFalse(calculator.isPrime(10));
        assertFalse(calculator.isPrime(1));  // 1 is not prime
    }

    @Test
    public void testFactorial() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        // Test valid input
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));  // 0! = 1

        // Test negative input (expecting an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        });

        // Test large value (factorial of 20)
        assertEquals(2432902008176640000L, calculator.factorial(20));  // Factorial of 20
    }
}
