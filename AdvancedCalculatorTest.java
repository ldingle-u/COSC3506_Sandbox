import org.junit.Test;
import static org.junit.Assert.*;

// test class
public class AdvancedCalculatorTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    // power unit tests
    @Test
    public void testPositivePower(){
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    public void testNegativePower(){
        assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroNegativePower(){
        calculator.power(0, -1);
    }

    // square root unit tests
    @Test
    public void testPositiveRoot(){
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRoot(){
        calculator.squareRoot(-4);
    }

    // isPrime unit tests
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

    // factorial unit tests
    @Test
    public void testFactorial5(){
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorial0(){
        assertEquals(1, calculator.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial(){
        calculator.factorial(-3);
    }

    @Test
    public void testFactorial20(){
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}
