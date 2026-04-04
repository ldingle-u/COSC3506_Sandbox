import static org.junit.Assert.*;
import org.junit.Test;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void testPowerPositive() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowerZeroNegative() {
        //expecting exception instead of Infinity
        calculator.power(0, -1);
    }

    @Test
    public void testSquareRootPositive() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        calculator.squareRoot(-4);
    }

    @Test
    public void testIsPrime() {
        assertTrue(calculator.isPrime(13));
        assertFalse(calculator.isPrime(10));
        assertTrue(calculator.isPrime(29));
        assertFalse(calculator.isPrime(1));
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialLarge() {
        // checking correct value
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calculator.factorial(-3);
    }
}