import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.math.BigInteger;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class AdvancedCalculatorTest
{
    private AdvancedCalculator calc;
    @Before
    public void beforeTest(){
        calc = new AdvancedCalculator();
    }


    //to test usual functions of the power method
    @Test
    public void testPower(){
        double result = calc.power(2, 3);
        assertEquals("2 to the power of 3 should equal 8", 8.0, result, 0.001);
        double result2 = calc.power(2, -3);
        assertEquals("2 to the power of -3 should equal -8", 0.125, result2, 0.0001);
    }

    //to test if it lets x/0 happen
    @Test(expected = IllegalArgumentException.class)
    public void testPowerExc(){
        calc.power(0, -1);
    }

    //testing positive square root
    @Test
    public void testPositiveSquareRoot(){
        double result = calc.squareRoot(9.0);
        assertEquals("Square Root of 9 should be 3.0", 3.0, result, 0.001);
    }

    //testing if exception is thrown if a negative number is passed as a parameter
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSquareRoot(){
        calc.squareRoot(-4);
    }


    //testing 2 prime and 2 non-prime numbers
    @Test
    public void testPrime(){
        boolean result1 = calc.isPrime(13);
        boolean result2 = calc.isPrime(10);
        boolean result3 = calc.isPrime(29);
        boolean result4 = calc.isPrime(1);

        assertTrue("Check for 13 should be true", result1);
        assertFalse("Check for 10 should be false", result2);
        assertTrue("Check for 29 should be true", result3);
        assertFalse("Check for 1 should be false", result4);
    }


    //factorial method returns result as BigInteger
    //result stored as strings
    //expected value stored as strings
    //both strings compared if equal

    //testing is 5! = 120
    @Test
    public void testFactorial5(){
        BigInteger intResult = calc.factorial(5);
        String stringResult = intResult.toString();
        String expected1 = "120";
        assertEquals("Factorial of 5 should equal 120", expected1, stringResult);
    }


    //testing if 0! = 120
    @Test
    public void testFactorial0(){
        BigInteger intResult = calc.factorial(0);
        String stringResult = intResult.toString();
        String expected1 = "1";
        assertEquals("Factorial of 0 should equal 1", expected1, stringResult);
    }


    //testing if (-3)! = error
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial(){
        calc.factorial(-3);
    }


    //testing if 20! = 2432902008176640000
    @Test
    public void testFactorial20(){
        BigInteger intResult = calc.factorial(20);
        String stringResult = intResult.toString();
        String expected = "2432902008176640000";
        assertEquals("Factorial of 20 should equal 2432902008176640000", expected, stringResult);
    }
}
