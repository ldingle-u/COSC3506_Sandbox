public class AdvancedCalculatorTest {
    public static void main(String args[]){
        AdvancedCalculator test = new AdvancedCalculator();

        try {
            System.out.println("Testing Power Method:");
            System.out.println("2^3 = "+test.power(2, 3));
            System.out.println("2^(-3) = "+test.power(2, -3));
            System.out.println("0^(-1) = "+test.power(0, -1));
        } catch (Exception e) {
            System.out.println("\"Error: Base should not be zero, while exponent is negative\"");
        } 

        try {
            System.out.println("Testing SquareRoot Method:");
            System.out.println("SquareRoot of 9 = "+ test.squareRoot(9));
            System.out.println("SquareRoot of -4"+ test.squareRoot(-4));
        } catch (Exception e) {
            System.out.println("\"Error: The value inside the root cannot be negative\"");
        } 
       
        try {
            System.out.println("Testing isPrime Method:");
            System.out.println("is 13 Prime: "+ test.isPrime(13));
            System.out.println("is 10 Prime: "+ test.isPrime(10));
            System.out.println("is 29 Prime: "+ test.isPrime(29));
            System.out.println("is 1  Prime: "+ test.isPrime(1));
        } catch (Exception e) {
            System.out.println("\"Error: Prime Method cannot be evaluated\"");
        } 

        try {
            System.out.println("Testing Factorial Method:");
            System.out.println(""+ test.factorial(5));
            System.out.println(""+ test.factorial(0));
            System.out.println(""+ test.factorial(20));
            System.out.println(""+ test.factorial(-3));
            
        } catch (Exception e) {
            System.out.println("\"Error: Factorial of Negative Values cannot be evaluated\"");
        } 

        



        
    }
}
