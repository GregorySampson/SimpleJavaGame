import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {

		/* in this section i have:
		Created a random number
		created a variable for the random number 
		created a variable for the number of tries
		created an input
		Created a variable for winning
		Created a while loop to allow multiple guesses
		 */

		Random number = new Random();
		int numberToGuess = number.nextInt(100)+1;
		int numberOfTries = 0;
		Scanner input = new Scanner (System.in);
		int userNumber;
		boolean tries = false;

		while (tries == false) {
	
			/* In this section i haves:
          Created a print statement to ask the user to guess
          assigned the input to the userNumber variable
          created an if statement for the users guess to say if it is too high, too low or correct.
          once the uses has made a guess it adds 1 to the number of guesses
          set the game to stop after number of guesses is past 10
          if the number is guessed the games stops
			 */

			System.out.println("Guess a number between 1 and 100");
			numberOfTries++;
			if (numberOfTries == 11) {
				tries = true;
			}
			else {
			userNumber = input.nextInt();	

				if (userNumber == numberToGuess){
					tries = true;
				}
				else if (userNumber > numberToGuess){
					System.out.println("Try again :(");
					System.out.println("Hint: The your number is too high.");
				}

				else {

					System.out.println("Try again :(");
					System.out.println("Hint: your number is too low.");
				}
			}

		}
		/* In this section i have:
		 *Given the user a brief on what the number of tries was
		 *told the user if they win or lose
		 *Tell the user what the number was
		 */
		if (numberOfTries <= 10) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("You have won the game");
		System.out.println("The number was:" + numberToGuess);
		System.out.println("Number of tries: " + numberOfTries+ "/10");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		input.close();
		}
		else {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("You have lost the game");
			System.out.println("The number was:" + numberToGuess);
			System.out.println("Number of fails:" + numberOfTries + "/10");
			System.out.println("Number of tries: 10/10");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			
		}
	}

}
