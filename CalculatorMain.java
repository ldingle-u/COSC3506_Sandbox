
public class CalculatorMain {
	public static void main(String[] args) {	//hello!
		AdvancedCalculator testcalc = new AdvancedCalculator();
		
		//power test
		System.out.println("Calculaot power test.");
		
		try {
			System.out.println(testcalc.power(2, 7)); 
			System.out.println(testcalc.power(15, 34));
			System.out.println(testcalc.power(0, -1)); //should throw error
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		//swuare root test
		System.out.println("Square root test");
		try {
			System.out.println(testcalc.squareRoot(256));
			System.out.println(testcalc.squareRoot(80));
			System.out.println(testcalc.squareRoot(-1));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		//isPrime test, no errors to be thrown
		System.out.println("Prime test.");
		try {
			System.out.println(testcalc.isPrime(23));
			System.out.println(testcalc.isPrime(81));
			System.out.println(testcalc.isPrime(-1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		
		//factoial test
		System.out.println("Factorial test.");
		try {
			System.out.println(testcalc.factorial(5));
			System.out.println(testcalc.factorial(18));
			System.out.println(testcalc.factorial(-1));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		
		System.out.println("Unit Test");
		for (int i=0; i<10000; i++) {
			
			try {
				testcalc.power((Math.random() * 1000), (int)(Math.random() * 1000));
			} catch (ArithmeticException e) {
				System.out.println("Power test: " + e.getMessage());
			}
			
			try {
				testcalc.squareRoot((int)(Math.random() * 1000));
			} catch (IllegalArgumentException e) {
				System.out.println("Square root test: " + e.getMessage());
			}
			
			try {
				testcalc.isPrime((int)(Math.random() * 1000));
			} catch (Exception e) {
				System.out.println("Prime test: " + e.getMessage());
			}
			
			try {
				testcalc.factorial((int)(Math.random() * 100));
			} catch (IllegalArgumentException e) {
				System.out.println("Factorial test: " + e.getMessage());
			}
			
			
		}
		System.out.println("Unit Test Complete.");
	}
}
