package defaultt;

import java.util.Scanner;

public class Snippet {
	 public static void playGuessingGame(Scanner scanner) {
	       
		 int computerChoice= (int)(Math.random() * 3);
	        System.out.println(computerChoice);
	
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.print("Guess a number between 1 and 10: ");
	        int guess = scanner.nextInt();
	
	        if (guess == computerChoice) {
	            System.out.println("Congratulations! You guessed the correct number.");
	        } else {
	            System.out.println("Sorry, the correct number was " + computerChoice + ".");
	        }
	    }
}

