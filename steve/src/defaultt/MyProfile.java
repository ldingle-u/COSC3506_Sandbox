// Name: Stephenraj Ganessan
// ID: 249523330

package defaultt;

import java.util.Scanner;

public class MyProfile {
    public static void main(String[] args) {
    	//to get the choices from user, i created the scanner
        Scanner scanner = new Scanner(System.in);

      //Displaying my profile options for user
        
        System.out.println(".......My profile details....... \nEnter any two choices to know my details");
        System.out.println("Choice 1. My Name");
        System.out.println("Choice 2. My native");
        System.out.println("Choice 3. My Favorite Pet name");
        System.out.println("Choice 4. Shall we play a Guessing Game");
        System.out.println("Choice 5. My Student ID");
        System.out.println("Choice 6. My algomau email ID");
        System.out.println("Choice 7. My Inspiration ");
        System.out.print("Choose any choice (1-7): ");

        System.out.println("\n Say Choice 1 :"); //user can enter choice1
        int choice = scanner.nextInt();

        System.out.println("Say Choice 2 :"); //user can enter choice2
        int choice1 = scanner.nextInt();

        //answers for the options stored in string type
        
        String s1 = "My Good name is Stephenraj Ganessan";
        String s2 = "My native is Puducherry, India";
        String s3 = "My favourite Pet name is TONNY";
        String s5 = "My Student ID is 249523330 ";
        String s6 = "My algomau email ID is sganessan@algomau.ca ";
        String s7 = "My DAD is my biggest Inspiration ";

       
            if ((choice >= 1 && choice <= 7) && (choice1 >= 1 && choice1 <= 7)) {   // checking choice and choice1 are <=7 
           
            	//if the statement works it act accordingly and print the answers for choice the user enters
            	
            if (choice == 1) {
                System.out.println(s1);
            }
       else if (choice == 2) {
                System.out.println(s2);
            }
       else if (choice == 3) {
                System.out.println(s3);
            }
       else if (choice == 5) {
                System.out.println(s5);
            }
       else if (choice == 6) {
           System.out.println(s6);
            }
       else if (choice == 7) {
               System.out.println(s7);
           }
       
            // its a guess number game if choice is 4
            
       else if (choice == 4) {
                int compNumber = (int) (Math.random() * 10);  //getting random number from computer
                System.out.println(compNumber);

                System.out.println("W'll Play a Guessing Game!");
                System.out.print("Guess a number between 1 and 10: ");  //asking user to guess number
                int guess = scanner.nextInt();

                if (guess == compNumber) {
                    System.out.println("WOWW..! You guessed Correct, number is:" + compNumber);
                } else {
                    System.out.println("Oops! Sorry.., the correct number was " + compNumber + ".");
                }
            }

           // now it runs for the 2nd choice of the user in the same way                   
          
            if (choice1 == 1) {
                    System.out.println(s1);
                }
        else if (choice1 == 2) {
                    System.out.println(s2);
                }
       else  if (choice1 == 3) {
                    System.out.println(s3);
                }
        else if (choice1 == 5) {
                    System.out.println(s5);
                }
        else if (choice1 == 6) {
            System.out.println(s6);
             }
        else if (choice1 == 7) {
                System.out.println(s7);
             } 
            
        else  if (choice1 == 4) {
                    int compNumber = (int) (Math.random() * 10);
                 //   System.out.println(compNumber);

                    System.out.println("W'll Play a Guessing Game!");
                    System.out.print("Guess a number between 1 and 10: ");
                    int guess = scanner.nextInt();

                    if (guess == compNumber) {
                        System.out.println("WOWW..! You guessed Correct, number is:" + compNumber);
                    } else {
                        System.out.println("Oops! Sorry.., the correct number was " + compNumber + ".");
                    }
                }
            }
            //if user enters more than 7 it says invalid

         else {
            System.out.println("Invalid...! Please enter a Choice from 1-7 only ");
        }
    }
}