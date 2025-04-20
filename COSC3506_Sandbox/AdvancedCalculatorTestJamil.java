import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTestJamil {

    // Test Power method
    @Test
    public void testPower_PositiveExponent() {
        assertEquals(8.0, AdvancedCalculator.power(2, 3));
    }

    @Test
    public void testPower_NegativeExponent() {
        assertEquals(0.125, AdvancedCalculator.power(2, -3));
    }

    @Test
    public void testPower_ZeroToNegativeExponent_ThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            AdvancedCalculator.power(0, -1);
        });
    }

    // Test Square Root method
    @Test
    public void testSquareRoot_Valid() {
        assertEquals(3.0, AdvancedCalculator.squareRoot(9));
    }

    @Test
    public void testSquareRoot_Negative_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.squareRoot(-4);
        });
    }

    // Test IsPrime method
    @Test
    public void testIsPrime_TrueCases() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertTrue(AdvancedCalculator.isPrime(29));
    }

    @Test
    public void testIsPrime_FalseCases() {
        assertFalse(AdvancedCalculator.isPrime(10));
        assertFalse(AdvancedCalculator.isPrime(1));
    }

    // Test Factorial method
    @Test
    public void testFactorial_ValidInputs() {
        assertEquals(120, AdvancedCalculator.factorial(5));
        assertEquals(1, AdvancedCalculator.factorial(0));
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20)); // Check large
    }

    @Test
    public void testFactorial_NegativeInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            AdvancedCalculator.factorial(-3);
        });
    }
    @Test
    public void testIsPrime_TrueCases1() {
        assertTrue(AdvancedCalculator.isPrime(13));
        assertTrue(AdvancedCalculator.isPrime(29));
    }
    @Test
    public void testIsPrime_FalseCases1() {
        assertFalse(AdvancedCalculator.isPrime(10));
        assertFalse(AdvancedCalculator.isPrime(1)); // 1 is not prime
    }
 // Test Factorial method

    


}
