public class advcalClass {
    public static void main(String args[]) {
        AdvancedCalculator advcal = new AdvancedCalculator();
        System.out.println("Power Method:");
        System.out.println("2^3: " + advcal.power(2, 3));
        System.out.println("2^(-3): " + advcal.power(2, -3));
        System.out.println("0^(-1): " + advcal.power(0, -1));
        System.out.println();
        System.out.println("SquareRoot Method:");
        System.out.println("SquareRoot of 9: " + advcal.squareRoot(9));
        System.out.println("SquareRoot of -4: " + advcal.squareRoot(-4));
        System.out.println();      
        System.out.println("isPrime Method:");
        System.out.println("is 13 Prime: " + advcal.isPrime(13));
        System.out.println("is 10 Prime: " + advcal.isPrime(10));
        System.out.println("is 29 Prime: " + advcal.isPrime(29));
        System.out.println("is 1  Prime: " + advcal.isPrime(1));
        System.out.println();
        System.out.println("Factorial Method:");
        System.out.println("Factorial of 5: " + advcal.factorial(5));
        System.out.println("Factorial of 0: " + advcal.factorial(0));
        System.out.println("Factorial of 20: " + advcal.factorial(20));
        System.out.println("Factorial of -3: " + advcal.factorial(-3));
    }
}