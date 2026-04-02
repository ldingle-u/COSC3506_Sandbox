import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AdvancedCalculatorTest
{
    @Test
    public void powerTest()
    {
        AdvancedCalculator calculator = new AdvancedCalculator();

        assertEquals(8, calculator.power(2, 3));

        double division = 1.0/8.0;
        assertEquals(division, calculator.power(2, -3));

        assertEquals(0, calculator.power(0, -1));

        //Extra test
        assertEquals(1, calculator.power(879247, 0));
    }

    @Test
    public void squareRootTest()
    {
        AdvancedCalculator calculator = new AdvancedCalculator();

        assertEquals(3, calculator.squareRoot(9));

        assertThrows(IllegalArgumentException.class,
                ()-> calculator.squareRoot(-4));

        //Extra test
        assertEquals(0, calculator.squareRoot(0));
    }

    @Test
    public void isPrimeTest()
    {
        AdvancedCalculator calculator = new AdvancedCalculator();

        assertEquals(true, calculator.isPrime(13));
        assertEquals(false, calculator.isPrime(10));
        assertEquals(true, calculator.isPrime(29));
        assertEquals(false, calculator.isPrime(1));

        //Extra test
        assertEquals(false, calculator.isPrime(9));
    }

    @Test
    public void factorialTest()
    {
        AdvancedCalculator calculator = new AdvancedCalculator();

        assertEquals(120, calculator.factorial(5));

        assertEquals(1, calculator.factorial(0));

        assertThrows(IllegalArgumentException.class,
                ()-> calculator.factorial(-3));

        assertThrows(IllegalArgumentException.class,
                ()-> calculator.factorial(20));

        //Extra tests
        assertEquals(479001600, calculator.factorial(12));
        assertThrows(IllegalArgumentException.class,
                ()-> calculator.factorial(13));
    }
}