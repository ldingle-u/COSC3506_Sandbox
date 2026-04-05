import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calculator = new AdvancedCalculator();

    // ========== POWER TESTS ==========
    
    @Test
    void testPowerPositiveExponent() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test
    void testPowerZeroToNegative() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.power(0, -1);
        });
    }

    // ========== SQUARE ROOT TESTS ==========
    
    @Test
    void testSquareRootPositive() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        });
    }

    // ========== IS PRIME TESTS ==========
    
    @Test
    void testIsPrimeTrue() {
        assertTrue(calculator.isPrime(13));
    }

    @Test
     void testIsPrimeFalse() {
        assertFalse(calculator.isPrime(10));
    }

    @Test
    void testIsPrimeLargePrime() {
        assertTrue(calculator.isPrime(29));
    }

    @Test
    void testIsPrimeOne() {
        assertFalse(calculator.isPrime(1));
    }

    // ========== FACTORIAL TESTS ==========
    
    @Test
    void testFactorialPositive() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        });
    }

    @Test
    void testFactorialTwenty() {
        // 20! = 2,432,902,008,176,640,000
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}
