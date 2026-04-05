import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

    @Test
    void testPower1() {
        assertEquals(8, calc.power(2,3));
    }

    @Test
    void testPower2() {
        assertEquals(0.125, calc.power(2,-3));
    }

    @Test
    void testPowerException() {
        assertThrows(Exception.class, () -> {
            calc.power(0,-1);
        });
    }

    @Test
    void testSquareRoot1() {
        assertEquals(3, calc.squareRoot(9));
    }

    @Test
    void testSquareRootException() {
        assertThrows(Exception.class, () -> {
            calc.squareRoot(-4);
        });
    }

    @Test
    void testIsPrime13() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    void testIsPrime10() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    void testIsPrime29() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    void testIsPrime1() {
        assertFalse(calc.isPrime(1));
    }

    @Test
    void testFactorial5() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void testFactorial0() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialException() {
        assertThrows(Exception.class, () -> {
            calc.factorial(-3);
        });
    }

    @Test
    void testFactorial20() {
        long result = calc.factorial(20);
        assertTrue(result > 0);
    }
}
