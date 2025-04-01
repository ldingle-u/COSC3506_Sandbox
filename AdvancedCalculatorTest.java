import org.junit.Before; 
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.math.BigInteger;

public class AdvancedCalculatorTest {

	private AdvancedCalculator calculator;
	
	@Before
	public void setUp() {
		// Initialize calculator before tests
		calculator = new AdvancedCalculator();
	}
	
	@Test
	public void testPower() {
		// Act
		double result = calculator.power(2,3);
		double resultTwo = calculator.power(2, -3);
		// Assert
		assertEquals("2 to the power of 3 should equal 8", 8, result, 0.001);
		assertEquals("2 to the power of -3 should equal 0.125", 0.125, resultTwo, 0.001);

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPowerException() {
		calculator.power(0, -1);
	}
	
	@Test
	public void testSquareRoot() {
		// Act
		double result = calculator.squareRoot(9);
		// Assert
		assertEquals("9 square rooted should equal 3", 3, result, 0.001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSquareRootException() {
		calculator.squareRoot(-4);
	}
	
	@Test
	public void testIsPrime() {
		// Act
		boolean result = calculator.isPrime(13);
		boolean resultTwo = calculator.isPrime(10);
		boolean resultThree = calculator.isPrime(29);
		boolean resultFour = calculator.isPrime(1);
		// Assert
		assertTrue("13 is a prime number", result);
		assertFalse("10 is not a prime number", resultTwo);
		assertTrue("29 is a prime number", resultThree);
		assertFalse("1 is not a prime number", resultFour);
	}
	
	@Test
	public void testFactorial() {
		// Act
		BigInteger result = calculator.factorial(5);
		BigInteger resultTwo = calculator.factorial(0);
		BigInteger resultThree = calculator.factorial(20);
		// Define specific number since out of range for int literals
		BigInteger testNum = new BigInteger("2432902008176640000");
		// Assert
		assertEquals("the factorial of 5 should equal 120", BigInteger.valueOf(120), result);
		assertEquals("the factorial of 0 should equal 1", BigInteger.ONE, resultTwo);
		assertEquals("the factorial of 20 should equal 2432902008176640000 ", testNum, resultThree);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFactorialException() {
		calculator.factorial(-3);
	}
}
