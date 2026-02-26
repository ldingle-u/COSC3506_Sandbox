package defaultt;

import java.util.Scanner;
import java.util.Random;

public class PersonalProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println(".......My profile details....... \nEnter any two choices to know my details");
        System.out.println("Choice 1. My Name");
        System.out.println("Choice 2. My native");
        System.out.println("Choice 3. My Favorite Pet name");
        System.out.println("Choice 4. Shall we play a Guessing Game");
        System.out.println("Choice 5. My inspiration");
        System.out.print("Enter your choice (1-5): ");
        
        System.out.println("\n Say Choice 1 :");
        int choice = scanner.nextInt();
        
        System.out.println("Say Choice 2 :");
        int choice1 = scanner.nextInt();

 
        String s1 = "My Good name is Stephenraj Ganessan";
        String s2 = "My native is Puducherry, India";
        String s3 = "My favourite Pet name is TONNY";
        String s5 = " My DAD is my biggest Inspiration ";

        	
 if ((choice >= 1 && choice <= 5) && (choice1 >=1 && choice1 <=5)) {
        		   if ((choice == 1 && choice1 == 1) || (choice == 1 && choice1 == 2) || (choice == 1 && choice1 == 3) || (choice == 1 && choice1 == 4) || (choice == 1 && choice1 == 5) 
        			|| (choice == 2 && choice1 == 1) || (choice == 2 && choice1 == 2) || (choice == 2 && choice1 == 3) || (choice == 2 && choice1 == 4) || (choice == 2 && choice1 == 5)
        			|| (choice == 3 && choice1 == 1) || (choice == 3 && choice1 == 2) || (choice == 3 && choice1 == 3) || (choice == 3 && choice1 == 4) || (choice == 3 && choice1 == 5)
        			|| (choice == 4 && choice1 == 1) || (choice == 4 && choice1 == 2) || (choice == 4 && choice1 == 3) || (choice == 4 && choice1 == 4) || (choice == 4 && choice1 == 5)
        			|| (choice == 5 && choice1 == 1) || (choice == 5 && choice1 == 2) || (choice == 5 && choice1 == 3) || (choice == 5 && choice1 == 4) || (choice == 5 && choice1 == 5))
        		   {	
        		if ((choice == 1) || (choice1 == 1)){
        		System.out.println( ""+ s1);}
        			if (((choice == 1) || (choice1 == 1)) &&  ((choice == 1) == (choice1 == 1))) {
        			System.out.println(""+ s1);
      
        	}
        		if ((choice == 2) || (choice1 == 2)) {
            		System.out.println( ""+ s2);}
            		if (((choice == 2) || (choice1 == 2)) &&  ((choice == 2) == (choice1 == 2))) {
            			System.out.println(""+ s2);
            		}
        		
        		if ((choice == 3) || (choice1 == 3)) {
            		System.out.println( ""+ s3);}
            		if (((choice == 3) || (choice1 == 3)) &&  ((choice == 3) == (choice1 == 3))) {
            			System.out.println(""+ s3);}
        		
        		if ((choice == 5) || (choice1 == 5)) {
                		System.out.println( "" + s5);}
                		if (((choice == 5) || (choice1 == 5)) &&  ((choice == 5) == (choice1 == 5))) {
                			System.out.println(""+ s5);
                			}
               	 if ((choice > 5) || (choice1 >5)) {
                	    	  
                		      System.out.println("invalid");
               	 }
                if ((choice == 4) || choice1 == 4) {
                    int compNumber = (int) (Math.random() * 10);
                    System.out.println(compNumber);

                    System.out.println("W'll Play a Guessing Game!");
                    System.out.print("Guess a number between 1 and 10: ");
                    int guess = scanner.nextInt();
                    

                    if (guess == compNumber) {
                        System.out.println("WOWW! You guessed the correct number, number is:" + compNumber);
                    } else  {
                        System.out.println("Sorry, the correct number was " + compNumber + ".");
                    }
                  
            }
               
                }
                  
        } else if (choice > 5) {
        	System.out.println("Invalid"); }}
        		}