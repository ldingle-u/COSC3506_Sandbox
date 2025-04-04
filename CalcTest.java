//test case

package nnn;

import org.junit.Before; 
import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CalcTest {

	private AdvancedCalculator calculator;
	@Before
	public void setUp() {
		calculator = new AdvancedCalculator();
	}
	
	//test to check power
	
	@Test
	public void testPower() {
		double powerResult = calculator.power(2,3);
		double negpowresult = calculator.power(2, -3);
		assertEquals("2 to the power of 3 = 8", 8, powerResult, 0.001);
		assertEquals("2 to the power of -3 = 0.125", 0.125, negpowresult, 0.001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPowerException() {
		calculator.power(0, -1);
	}
	
	//Test square root
	
	@Test
	public void testSquareRoot1() {
		Double sqresult = calculator.squareRoot(9);
		assertEquals("squareroot of 9 = 3", Double.valueOf(3), sqresult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSquareRoot2() {
		Double invalidroot = calculator.squareRoot(-4);
		
	}
	
	//Test for prime number
	
	@Test
	public void testIsPrime1() {
		Boolean Primeresult = calculator.isPrime(13);
		assertTrue("13 is a prime", Primeresult);
	}
	
	@Test
	public void testIsPrime2() {
		Boolean nonprimeresult = calculator.isPrime(10);
		assertFalse("10 is not a prime", nonprimeresult);
	}
	
	@Test
	public void testIsPrime3() {
		Boolean bigprime = calculator.isPrime(29);
		assertTrue("29 is a prime", bigprime);
	}
	
	@Test
	public void testIsPrime4() {
		Boolean trickyprime = calculator.isPrime(1);
		assertFalse("1 is not be a prime", trickyprime);
	}
	
	@Test
	public void testFactorial() {
		BigInteger factorialA = calculator.factorial(5);
		BigInteger factorialB = calculator.factorial(0);
		BigInteger factorialC = calculator.factorial(20);
		BigInteger largefactorial = new BigInteger("2432902008176640000");
		assertEquals("factorial of 5 equals 120", BigInteger.valueOf(120), factorialA);
		assertEquals("factorial of 0 equals 1", BigInteger.ONE, factorialB);
		assertEquals("factorial of 20 equals 2432902008176640000 ", largefactorial, factorialC);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFactorialException() {
		calculator.factorial(-3);
	}
}

