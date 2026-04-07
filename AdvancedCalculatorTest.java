import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AdvancedCalculatorTest {


    AdvancedCalculator calc = new AdvancedCalculator();


    @Test
    void testValue2_3() {
        double value = calc.power(2, 3);
        assertEquals(8.0, value, 0.0001);
    }

    @Test
    void testValue2_Neg3(){
        double value = calc.power(2, -3);
        assertEquals(0.125, value, 0.0001);
    }

    @Test
    void testPowerZeroNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.power(0, -1);
            });
    }

    @Test
    void testSquareRootPositive() {
        assertEquals(3, calc.squareRoot(9), 0.001);
    }

    @Test
    void testSquareRoot_neg4_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4);
        });
    }

    @Test
    void testIsPrime_13() {
        assertTrue(calc.isPrime(13));
    }

    @Test
    void testIsPrime_10() {
        assertFalse(calc.isPrime(10));
    }

    @Test
    void testIsPrime_29() {
        assertTrue(calc.isPrime(29));
    }

    @Test
    void testIsPrime_1() {
        assertFalse(calc.isPrime(1));
    }

    @Test
    void testFactorial_5() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void testFactorial_0() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorial_neg3_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
    }

    @Test
    void testFactorial_20() {
        assertEquals(2432902008176640000L, calc.factorial(20));
    }



}
