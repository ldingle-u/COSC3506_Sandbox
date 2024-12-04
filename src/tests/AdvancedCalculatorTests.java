package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdvancedCalculatorTests {

	private final AdvancedCalculator calculator = new AdvancedCalculator();
	
	@Test
	 void testPower() {
        // 2^3 = 8
        assertEquals(8, calculator.power(2, 3));
        
        // 2^(-3) = 1 / 2^3 = 0.125
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
        
        // Power of 0 to a negative number should throw an exception
        assertThrows(ArithmeticException.class, () -> calculator.power(0, -1));
    }

    // Test for the squareRoot method
    @Test
    void testSquareRoot() {
        // Square root of 9 is 3
        assertEquals(3, calculator.squareRoot(9));

        // Square root of a negative number should throw an exception
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    // Test for the isPrime method
    @Test
    void testIsPrime() {
        // 13 is prime
        assertTrue(calculator.isPrime(13));
        
        // 10 is not prime
        assertFalse(calculator.isPrime(10));
        
        // 29 is prime
        assertTrue(calculator.isPrime(29));
        
        // 1 is not prime
        assertFalse(calculator.isPrime(1));
    }

    // Test for the factorial method
    @Test
    void testFactorial() {
        // 5! = 5*4*3*2*1 = 120
        assertEquals(120, calculator.factorial(5));

        // 0! = 1 (by definition)
        assertEquals(1, calculator.factorial(0));

        // Factorial of a negative number should throw an exception
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));

        // 20! is a very large number
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }

}
