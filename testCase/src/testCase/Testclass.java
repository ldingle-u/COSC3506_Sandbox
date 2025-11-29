package testCase;

public class Testclass {
    
    // Test case
    public static void main(String[] args) {
    	AdvancedCalculator
    	
		// Testing the power method for errors. Found 1
    	try {
    		System.out.println("Testing for the power method");
        	System.out.println(power(2, 3));	// Permissible
        	System.out.println(power(2, -3));	// Permissible
        	System.out.println(power(0, -1));	// Error. Cannot raise 0 to be a negative number  	
        	
    	} catch (Exception invalidPower){
    		System.out.println("error\n");
    	}
    	
    	// Testing for squareroot method for errors.    	
    	try {
    		System.out.println("Testing for the square root method");
        	System.out.println(squareRoot(9));	// Permissible
        	System.out.println(squareRoot(-4)); //Error. Cannot take square root of negative number
    	} catch(Exception invalidRoot) {
    		System.out.println("error\n");
    	}
    	
    	// Testing for isPrime method for errors
    	try {
    		System.out.println("Testing for the isPrime method");
        	System.out.println(isPrime(13));	// Permissible
        	System.out.println(isPrime(10));	// Permissible
        	System.out.println(isPrime(29));	// Permissible
        	System.out.println(isPrime(1));		// Permissible
    	} catch (Exception invalidPrime) {
    		System.out.println("error\n");
    	}
    	
    	// Testing for factorial method for errors
    	try {
    		System.out.println("Testing for the factorial method");
        	System.out.println(factorial(5));	// Permissible
        	System.out.println(factorial(0));	// Permissible
        	System.out.println(factorial(20));	// Permissible
        	System.out.println(factorial(-3));	// Permissible

    	} catch (Exception invalidFactorial){
    		System.out.println("error\n");
    	}	
    }
}
