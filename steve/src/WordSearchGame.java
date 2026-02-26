// Name : Stephenraj Ganessan
// Student Number: 249523330
// COSC1046002C - Assignment #2

import java.util.Scanner;

public class WordSearchGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String hiddenWord = "momo"; // i kept the hidden word as momo

		String wordSearch = generateRandomString(10) + hiddenWord + generateRandomString(7); //merging random char and hidden word
		System.out.println("Word Search: " + wordSearch); 

		String userGuess;
		do { 
			System.out.print("Enter the word you found: ");
			userGuess = scanner.nextLine(); 		//getting the guess from the user
			userGuess = userGuess.toLowerCase();	//ignoring the case of the words
			System.out.println(userGuess.equals(hiddenWord) ? "Correct...! You found the word." : "Try again!"); // prints correct if its equal elase try again
		} while (!userGuess.equals(hiddenWord));

	}
													// using method to create some random char
	public static String generateRandomString(int length) {
		String randomString = "";

		for (int i = 0; i < length; i++) {
			char randomChar = (char) ('a' + (Math.random() * 26));
			randomString += randomChar;
		}
		return randomString;
	}
}
