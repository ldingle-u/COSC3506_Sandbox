import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new AdvancedCalculator();
    }

    @Test
    void testPowerPositiveExponent() {
        double result = calculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    void testPowerNegativeExponent() {
        double result = calculator.power(2, -3);
        assertEquals(0.125, result, 0.0001);
    }

    @Test
    void testPowerZeroBaseNegativeExponentThrowsException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.power(0, -1)
        );
        assertEquals("Can't raise zero to a negative power - that's undefined", exception.getMessage());
    }

    @Test
    void testSquareRootOfNine() {
        double result = calculator.squareRoot(9);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    void testSquareRootNegativeNumberThrowsException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.squareRoot(-4)
        );
        assertEquals("Cannot calculate square root of a negative number", exception.getMessage());
    }

    @Test
    void testIsPrime13() {
        assertTrue(calculator.isPrime(13));
    }

    @Test
    void testIsPrime10() {
        assertFalse(calculator.isPrime(10));
    }

    @Test
    void testIsPrime29() {
        assertTrue(calculator.isPrime(29));
    }

    @Test
    void testIsPrime1() {
        assertFalse(calculator.isPrime(1));
    }

    @Test
    void testFactorial5() {
        assertEquals(120L, calculator.factorial(5));
    }

    @Test
    void testFactorial0() {
        assertEquals(1L, calculator.factorial(0));
    }

    @Test
    void testFactorialNegativeThrowsException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.factorial(-3)
        );
        assertEquals("Factorial is undefined for negative numbers", exception.getMessage());
    }

    @Test
    void testFactorial20() {
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}