import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new AdvancedCalculator();
    }

    // ----- Power Tests -----
    @Test
    public void testPowerPositiveExponent() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test
    public void testPowerZeroNegativeExponent() {
        assertThrows(ArithmeticException.class, () -> calculator.power(0, -1));
    }

    // ----- SquareRoot Tests -----
    @Test
    public void testSquareRootPositive() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    // ----- IsPrime Tests -----
    @Test
    public void testIsPrime13() {
        assertTrue(calculator.isPrime(13));
    }

    @Test
    public void testIsPrime10() {
        assertFalse(calculator.isPrime(10));
    }

    @Test
    public void testIsPrime29() {
        assertTrue(calculator.isPrime(29));
    }

    @Test
    public void testIsPrime1() {
        assertFalse(calculator.isPrime(1));
    }

    // ----- Factorial Tests -----
    @Test
    public void testFactorial5() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorial0() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
    }

    @Test
    public void testFactorial20() {
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}
