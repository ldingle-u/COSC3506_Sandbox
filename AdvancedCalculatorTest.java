import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    AdvancedCalculator calc = new AdvancedCalculator();

}
@Test
void testPowerPositive() {
    assertEquals(8, calc.power(2, 3));
}

@Test
void testPowerNegative() {
    assertEquals(0.125, calc.power(2, -3));
}

@Test
void testPowerException() {
    assertThrows(IllegalArgumentException.class, () -> {
        calc.power(0, -1);
    });
}
@Test
void testSquareRootValid() {
    assertEquals(3, calc.squareRoot(9));
}

@Test
void testSquareRootException() {
    assertThrows(IllegalArgumentException.class, () -> {
        calc.squareRoot(-4);
    });
}
@Test
void testIsPrime() {
    assertTrue(calc.isPrime(13));
    assertFalse(calc.isPrime(10));
    assertTrue(calc.isPrime(29));
    assertFalse(calc.isPrime(1));
}
@Test
void testFactorialValid() {
    assertEquals(120, calc.factorial(5));
    assertEquals(1, calc.factorial(0));
}

@Test
void testFactorialException() {
    assertThrows(IllegalArgumentException.class, () -> {
        calc.factorial(-3);
    });
}

@Test
void testFactorialLarge() {
    assertEquals(2432902008176640000L, calc.factorial(20));
}
