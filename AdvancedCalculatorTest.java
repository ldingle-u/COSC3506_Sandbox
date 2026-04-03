import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    @Test
    void testPowerTwoThree() {
        assertEquals(8.0, calc.power(2, 3), 0.0001);
    }

    @Test
    void testPowerTwoNegativeThree() {
        assertEquals(0.125, calc.power(2, -3), 0.0001);
    }

    @Test
    void testPowerZeroNegativeOneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.power(0, -1));
    }

    @Test
    void testSquareRootNine() {
        assertEquals(3.0, calc.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootNegativeFourThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    @Test
    void testIsPrimeThirteen() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    void testIsPrimeTen() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    void testIsPrimeTwentyNine() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    void testIsPrimeOne() {
        assertFalse(calc.isPrime(1));
    }

    @Test
    void testFactorialFive() {
        assertEquals(120L, calc.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1L, calc.factorial(0));
    }

    @Test
    void testFactorialNegativeThreeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    void testFactorialTwenty() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}