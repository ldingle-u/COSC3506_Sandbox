//COSC 3506 assignment4
//Student name: Jiayi Zhang
//Student number: 229644870
//IDE: eclipse

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

public class AdvancedCalculatorTest {
	private AdvancedCalculator calculator;
	
	@Before
	public void setUp() {
		// Initialize the Calculator before each test
		calculator = new AdvancedCalculator();
	}
	
	//--test power
	@Test
	public void testPower1() {
		// Act
		Double result = calculator.power(2, 3);
		// Assert
		assertEquals("2 to the power of 3 should equal 8", Double.valueOf(8), result);
	}
	
	@Test
	public void testPower2() {
		// Act
		Double result = calculator.power(2, -3);
		// Assert
		assertEquals("2 to the power of -3 should equal 0.125", Double.valueOf(0.125), result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPower3() {
		// Act
		Double result = calculator.power(0, -1);
		
	}

	//--test squareroot
	@Test
	public void testSquareRoot1() {
		// Act
		Double result = calculator.squareRoot(9);
		// Assert
		assertEquals("The squareroot of 9 should equal 3", Double.valueOf(3), result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSquareRoot2() {
		// Act
		Double result = calculator.squareRoot(-4);
		
	}
	
	//--test is prime
	@Test
	public void testIsPrime1() {
		// Act
		Boolean result = calculator.isPrime(13);
		// Assert
		assertTrue("The 13 should be a prime", result);
	}
	
	@Test
	public void testIsPrime2() {
		// Act
		Boolean result = calculator.isPrime(10);
		// Assert
		assertFalse("The 10 should not be a prime", result);
	}
	
	@Test
	public void testIsPrime3() {
		// Act
		Boolean result = calculator.isPrime(29);
		// Assert
		assertTrue("The 29 should be a prime", result);
	}
	
	@Test
	public void testIsPrime4() {
		// Act
		Boolean result = calculator.isPrime(1);
		// Assert
		assertFalse("The 1 should not be a prime", result);
	}
	
	//--test factorial 
	@Test
	public void testFactorial1() {
		// Act
		BigInteger result = calculator.factorial(5);
		// Assert
		assertEquals("The factorial of 5 should equal 120", new BigInteger("120"), result);
	}
	
	@Test
	public void testFactorial2() {
		// Act
		BigInteger result = calculator.factorial(0);
		// Assert
		assertEquals("The factorial of 0 should equal 1", new BigInteger("1"), result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFactorial3() {
		// Act
		BigInteger result = calculator.factorial(-3);
		
	}
	
	@Test
	public void testFactorial4() {
		// Act
		BigInteger result = calculator.factorial(20);
		// Assert
		assertEquals("The factorial of 20 should equal 2,432,902,008,176,640,000", new BigInteger("2432902008176640000"), result);
	}
	
}

