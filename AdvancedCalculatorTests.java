package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTests {

    AdvancedCalculator calc = new AdvancedCalculator();

    @Test
    void power() {
        //For testing of positive exp
        assertEquals(8.0, calc.power(2, 3), 0.0001, " 2^3 should be 8"); //2^3 = 8

        //Testing of negative exp
        assertEquals(0.125, calc.power(2, -3), 0.0001, " 2^-3 should be 8");  // 2^(-3) = 1 / 2^3 = 0.125

        //Testing of base 0 with neg exp
        assertThrowsException(ArithmeticException.class, () -> calc.power(0, -1), "Throws ArithmeticException for 0^-1");
    }

    @Test
    void squareRoot() {
        //Testing testing square root
        assertEquals(3.0, calc.squareRoot(9), 0.0001, "Square root of 9 should be 3");

        // Testing negative input
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4), "This should throw Illegal Argument Exception for square root of a negative number");
    }

    @Test
    void IsPrime() {

        //Testing of prime number
        assertTrue(calc.IsPrime(13), " 13 should be a prime number"); // 13 is prime
        assertTrue(calc.IsPrime(29), " 29 should be a prime number"); // 29 is prime

        //Testing of non-prime number
        assertFalse(calc.IsPrime(10), " 10 should not be a prime number"); // 10 is not prime
        assertFalse(calc.IsPrime(1), " 1 should not be a prime number");  // 1 is not prime

    }

    @Test
    void factorial() {
        //Testing good inputs
        assertEquals(1, calc.factorial(0), "0! should be 1 "); // 0! = 1 (by definition)
        assertEquals(120, calc.factorial(5), "5! should be 120 "); // 5! = 5*4*3*2*1 = 120

        //Testing negative inputs
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3), "Should throw Illegal Argument Exception for factorial of a negative number");

        //Testing large value input
        assertEquals(2432902008176640000L, calc.factorial(20),
                "20! should be 2432902008176640000");
    }
}

