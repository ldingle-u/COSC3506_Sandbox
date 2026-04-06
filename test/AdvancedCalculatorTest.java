import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void testExponentCase1(){
        double Case1 = calculator.power(2,3);
        assertEquals(8.0, Case1, 0.0001);

    }

    @Test
    public void testExponentCase2(){
        double Case2 = calculator.power(2,-3);
        assertEquals(0.125, Case2, 0.0001);

    }
    @Test
    public void testExponentCase3(){
        assertThrows(IllegalArgumentException.class, () -> calculator.power(0,-1));
    }

    @Test
    public void testSqrtCase1(){
        double Case1 = calculator.squareRoot(9);
        assertEquals(3.0, Case1, 0.0001);
    }

    @Test
    public void testSqrtCase2(){
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    @Test
    public void testIsPrime13(){
        assertTrue(calculator.isPrime(13));
    }
    @Test
    public void testIsPrime10(){
        assertFalse(calculator.isPrime(10));
    }

    @Test
    public void testIsPrime29(){
        assertTrue(calculator.isPrime(29));
    }

    @Test
    public void testIsPrime1(){
        assertFalse(calculator.isPrime(1));
    }

    @Test
    public void testFactorial5(){
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorial0(){
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorial3(){
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
    }

    @Test
    public void testFactorial20(){
        long result = calculator.factorial(20);
        assertTrue(result > 0);

    }    }