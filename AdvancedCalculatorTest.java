import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

	AdvancedCalculator ca = new AdvancedCalculator();

	@Test
	void Power() {
		assertEquals(8.0, ca.power(2, 3)); 
		assertEquals(0.125, ca.power(2, -3));
		assertThrows(Exception.class, () -> { // after updating the exception logic Yes it is properly checking the exception for the case where the base is 0 and the exponent is negative, which is our third test case(0,-1) where the 0 is the base and -1 is the exponent.
			calc.power(0, -1);
		});
	}

	@Test
	void SquareRoot() {
		assertEquals(3.0, ca.squareRoot(9));
		assertThrows(Exception.class, () -> { // no changes was needed
			calc.squareRoot(-4);
		});
	}

	@Test
	void IsPrime() { // no changes was needed
		assertTrue(ca.isPrime(13));
		assertFalse(ca.isPrime(10));
		assertTrue(ca.isPrime(29));
		assertFalse(ca.isPrime(1));
	}

	@Test
	void Factorial() {
		assertEquals(120, ca.factorial(5));
		assertEquals(1, ca.factorial(0));

		assertThrows(Exception.class, () -> {
			calc.factorial(-3);
		});

		assertEquals(2432902008176640000L, ca.factorial(20)); // just updated the expected value to long and added L at the end to indicate that it is a long literal.
	}
}
