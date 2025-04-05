import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    // Create an instance of AdvancedCalculator
    AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void testPower_PositiveExponent() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    public void testPower_NegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test
    public void testPower_ZeroNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.power(0, -1);
        });
    }

    @Test
    public void testSquareRoot_Positive() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test
    public void testSquareRoot_Negative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        });
    }

    @Test
    public void testIsPrime_True() {
        assertTrue(calculator.isPrime(13));
        assertTrue(calculator.isPrime(29));
    }

    @Test
    public void testIsPrime_False() {
        assertFalse(calculator.isPrime(10));
        assertFalse(calculator.isPrime(1));
    }

    @Test
    public void testFactorial_Valid() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorial_Negative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        });
    }

    @Test
    public void testFactorial_Large() {
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}


