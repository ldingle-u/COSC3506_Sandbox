import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Himath Helessage 229547880
 * Test class for the Advanced Calculator
 */
public class AdvancedCalculatorTest {
    //DELTA as required for double comparisons
    private static final double DELTA = 0.0001;

    //Power testing with (2,3), (2, -3) and (0, -1)

    @Test
    public void testPower() {
        //2^3 is 8
        assertEquals(8.0, AdvancedCalculator.power(2, 3), DELTA);
        
        //2^-3 is 0.125
        assertEquals(0.125, AdvancedCalculator.power(2, -3), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroPowerException() {
        //will throw an arithmetic exception
        AdvancedCalculator.power(0, -1);
    }

    //Square root testing with 9 and -4

    @Test
    public void testSquareRoot() {
        //square root of 9 is 3
        assertEquals(3.0,AdvancedCalculator.squareRoot(9), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSquareRootException() {
        //will throw an illegal argument exception
        AdvancedCalculator.squareRoot(-4);
    }
    
    //Prime testing with 13, 10, 29, 1

    @Test
    public void testIsPrime() {
        //13 is a prime
        assertEquals(true, AdvancedCalculator.isPrime(13));

        //10 is not a prime
        assertEquals(false, AdvancedCalculator.isPrime(10));

        //29 is a prime
        assertEquals(true, AdvancedCalculator.isPrime(29));

        //1 is not a prime
        assertEquals(false, AdvancedCalculator.isPrime(1));
    }

    //Factorial testing with 5, 0, -3, 20
    
    @Test
    public void testFactorial() {
        //5! is 120
        assertEquals(120L, AdvancedCalculator.factorial(5));

        //0! is 1
        assertEquals(1L, AdvancedCalculator.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorialException() {
        //will throw an illegal argument exception
        AdvancedCalculator.factorial(-3);
    }

    @Test
    public void testFactorialMaxLongVal() {
        // (20) - largest that fits in a long (2,432,902,008,176,640,000)
        assertEquals(2432902008176640000L, AdvancedCalculator.factorial(20));
    }

}
