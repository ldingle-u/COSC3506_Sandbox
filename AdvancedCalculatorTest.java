import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {
    AdvancedCalculator calc = new AdvancedCalculator();

    @Test
    void testPowerPosExp() {
        assertEquals(8, calc.power(2, 3));
    }
    @Test
    void testPowerNegExp(){
        assertEquals(0.125, calc.power (2, -3), 0.0001);
    }
    @Test
    void testPowerZeroNegExp(){
        //failed at first but then added an if statement to catch these issues and it then passed
        assertThrows(ArithmeticException.class, () -> {
           calc.power(0,-1);
        });
    }
    @Test
    void testSquareRootPos(){
        assertEquals(3.0, calc.squareRoot(9), 0.0001);
    }
    @Test
    void testSquareRootNeg(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-4);
        });
    }
    @Test
    void testIsPrime13(){
        assertTrue(calc.isPrime(13));
    }

    @Test
    void testIsPrime10(){
        assertFalse(calc.isPrime(10));
    }
    @Test
    void testIsPrime29(){
        assertTrue(calc.isPrime(29));
    }
    @Test
    void testIsPrime1(){
        assertFalse(calc.isPrime(1));
    }
    @Test
    void testFactorial5(){
        assertEquals(120, calc.factorial(5));
    }
    @Test
    void testFActorial0(){
        assertEquals(1, calc.factorial(0));
    }
    @Test
    void testFactorialNeg(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-3);
        });
    }
    @Test
    void testBigFactorial20(){
        //This failed likely because it is too big for int type to hold without overflow, so long would be more appropriate in the calculator
        long result = calc.factorial(20);
        //first checked if there was an overflow and it failed
        assertTrue(result>0, "All factorials should be positive");

        //now checking if it's the actual value now that the overflow is fixed
        assertEquals(2432902008176640000L, result);
    }
}
