import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    // ============= Power Method Tests =============
    
    @Test
    public void testPowerPositiveExponent() {
        // Test case: (2, 3) = 8
        double result = AdvancedCalculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        // Test case: (2, -3) = 0.125
        double result = AdvancedCalculator.power(2, -3);
        assertEquals(0.125, result, 0.0001);
    }

    @Test
    public void testPowerZeroToNegativeExponent() {
        // Test case: (0, -1) should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            AdvancedCalculator.power(0, -1);
        });
    }

    // ============= SquareRoot Method Tests =============

    @Test
    public void testSquareRootPositive() {
        // Test case: (9) = 3
        double result = AdvancedCalculator.squareRoot(9);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        // Test case: (-4) should throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.squareRoot(-4);
        });
    }

    // ============= IsPrime Method Tests =============

    @Test
    public void testIsPrimeTrueCase13() {
        // Test case: 13 is prime
        assertTrue(AdvancedCalculator.isPrime(13));
    }

    @Test
    public void testIsPrimeFalseCase10() {
        // Test case: 10 is not prime
        assertFalse(AdvancedCalculator.isPrime(10));
    }

    @Test
    public void testIsPrimeTrueCase29() {
        // Test case: 29 is prime
        assertTrue(AdvancedCalculator.isPrime(29));
    }

    @Test
    public void testIsPrimeFalseCase1() {
        // Test case: 1 is not prime
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    // ============= Factorial Method Tests =============

    @Test
    public void testFactorial5() {
        // Test case: 5! = 120
        long result = AdvancedCalculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorial0() {
        // Test case: 0! = 1
        long result = AdvancedCalculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialNegative() {
        // Test case: (-3) should throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.factorial(-3);
        });
    }

    @Test
    public void testFactorial20() {
        // Test case: 20! = 2432902008176640000
        long result = AdvancedCalculator.factorial(20);
        assertEquals(2432902008176640000L, result);
    }
}
