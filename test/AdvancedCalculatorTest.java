import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    // --- power()---
    @Test
    public void testPower_2_3() {
        assertEquals(8.0, calc.power(2, 3));
    }

    @Test
    public void testPower_2_negative3() {
        assertEquals(0.125, calc.power(2, -3), 0.0001);
    }

    @Test
    public void testPower_0_negative1() {
        // 0^-1 = 1/0 = Infinity
        assertEquals(Double.POSITIVE_INFINITY, calc.power(0, -1));
    }

    // --- squareRoot()---
    @Test
    public void testSquareRoot_9() {
        assertEquals(3.0, calc.squareRoot(9));
    }

    @Test
    public void testSquareRoot_negative_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }

    // --- isPrime()---
    @Test
    public void testIsPrime_13() { assertTrue(calc.isPrime(13)); }

    @Test
    public void testIsPrime_10() { assertFalse(calc.isPrime(10)); }

    @Test
    public void testIsPrime_29() { assertTrue(calc.isPrime(29)); }

    @Test
    public void testIsPrime_1() { assertFalse(calc.isPrime(1)); }

    // --- factorial()---
    @Test
    public void testFactorial_5() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    public void testFactorial_0() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    public void testFactorial_negative_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    public void testFactorial_20() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}