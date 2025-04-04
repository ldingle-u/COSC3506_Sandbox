import org.junit.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {
    private final AdvancedCalculator calculator = new AdvancedCalculator();

    // Power method tests
    @Test
    public void testPowerPositiveExponent() {
        assertEquals(8, calculator.power(2, 3), "2^3 should be 8");
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), "2^-3 should be 0.125");
    }

    @Test
    public void testPowerZeroExponent() {
        assertEquals(1, calculator.power(2, 0), "Any number raised to power 0 should be 1");
    }

    @Test
    public void testPowerZeroBaseNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> calculator.power(0, -1), "Should throw ArithmeticException for 0^-1");
    }

    // SquareRoot method tests
    @Test
    public void testSquareRootPositiveNumber() {
        assertEquals(3, calculator.squareRoot(9), "Square root of 9 should be 3");
    }

    @Test
    public void testSquareRootNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4), "Should throw IllegalArgumentException for negative numbers");
    }

    // IsPrime method tests
    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(calculator.isPrime(13), "13 should be prime");
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(calculator.isPrime(10), "10 should not be prime");
    }

    @Test
    public void testIsPrimeWithAnotherPrimeNumber() {
        assertTrue(calculator.isPrime(29), "29 should be prime");
    }

    @Test
    public void testIsPrimeWithOne() {
        assertFalse(calculator.isPrime(1), "1 should not be prime");
    }

    // Factorial method tests
    @Test
    public void testFactorialPositiveNumber() {
        BigInteger expected = new BigInteger("120");  // 5! = 120
        assertEquals(expected, calculator.factorial(5), "5! should be 120");
    }

    @Test
    public void testFactorialZero() {
        BigInteger expected = BigInteger.ONE;  // 0! is 1, represented as BigInteger
        assertEquals(expected, calculator.factorial(0), "0! should be 1");
    }

    @Test
    public void testFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3), "Factorial is undefined for negative numbers");
    }

    @Test
    public void testFactorialLargeNumber() {
        BigInteger expected = new BigInteger("2432902008176640000");  // 20!
        assertEquals(expected, calculator.factorial(20), "20! should be 2432902008176640000");
    }
}