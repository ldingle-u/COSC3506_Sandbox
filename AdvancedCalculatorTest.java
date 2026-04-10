import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    // ============================================================
    // POWER METHOD TESTS
    // ============================================================

    @Test
    @DisplayName("Power: (2, 3) should return 8")
    void testPower_PositiveExponent() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    @DisplayName("Power: (2, -3) should return 0.125")
    void testPower_NegativeExponent() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test
    @DisplayName("Power: (0, -1) should return Infinity (division by zero)")
    void testPower_ZeroBaseNegativeExponent() {
        assertEquals(Double.POSITIVE_INFINITY, calculator.power(0, -1), 0.0001);
    }


    // ============================================================
    // SQUARE ROOT METHOD TESTS
    // ============================================================

    @Test
    @DisplayName("SquareRoot: (9) should return 3")
    void testSquareRoot_PositiveNumber() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test
    @DisplayName("SquareRoot: (-4) should throw IllegalArgumentException")
    void testSquareRoot_NegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }


    // ============================================================
    // IS PRIME METHOD TESTS
    // ============================================================

    @Test
    @DisplayName("IsPrime: 13 should return true")
    void testIsPrime_13() {
        assertTrue(calculator.isPrime(13));
    }

    @Test
    @DisplayName("IsPrime: 10 should return false")
    void testIsPrime_10() {
        assertFalse(calculator.isPrime(10));
    }

    @Test
    @DisplayName("IsPrime: 29 should return true")
    void testIsPrime_29() {
        assertTrue(calculator.isPrime(29));
    }

    @Test
    @DisplayName("IsPrime: 1 should return false")
    void testIsPrime_1() {
        assertFalse(calculator.isPrime(1));
    }


    // ============================================================
    // FACTORIAL METHOD TESTS
    // ============================================================

    @Test
    @DisplayName("Factorial: 5 should return 120")
    void testFactorial_5() {
        assertEquals(BigInteger.valueOf(120), calculator.factorial(5));
    }

    @Test
    @DisplayName("Factorial: 0 should return 1")
    void testFactorial_0() {
        assertEquals(BigInteger.ONE, calculator.factorial(0));
    }

    @Test
    @DisplayName("Factorial: -3 should throw IllegalArgumentException")
    void testFactorial_NegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
    }

    @Test
    @DisplayName("Factorial: 20 should return correct large value (2,432,902,008,176,640,000)")
    void testFactorial_20() {
        BigInteger expected = new BigInteger("2432902008176640000");
        assertEquals(expected, calculator.factorial(20));
    }
}