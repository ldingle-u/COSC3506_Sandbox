import java.util.Scanner;

public class TestingExceptions {

	public static void main(String[] args) {
		int[] numbers = { 8, 29, 65, 63 };
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter an index to return a value");
		try {
			int index = input.nextInt();
			System.out.println("the value at index " + index + " is " +numbers[index]);	
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex.getMessage());
			
		}
		catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		System.out.println("program continues");
	}

}
