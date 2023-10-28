import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame1{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		int lowerBound = 1;
       	        int upperBound = 100;
       		int maxAttempts = 10;
        	int roundsWon = 0;
        	int totalAttempts = 0;
        	boolean playAgain = true;

       		System.out.println("Welcome to the Number Guessing Game!");
		do{
			int numberToGuess = ra.nextInt(upperBound - lowerBound + 1) + lowerBound;
            		int attempts = 0;

           		 System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");

            		do {
                		System.out.print("Enter your guess: ");
                		int userGuess = sc.nextInt();
               			 attempts++;

                		if (userGuess == numberToGuess) {
                   			 System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                   			 roundsWon++;
                   			 break;
                		}
				 else if (userGuess < numberToGuess) {
                   			 System.out.println("Too low. Try again.");
                		} 
				else {
                    			System.out.println("Too high. Try again.");
               			 }
			}while (attempts < maxAttempts);
			 if (attempts == maxAttempts) {
                			System.out.println("Sorry, you've run out of attempts. The number was " + numberToGuess + ".");
            		}

           		 totalAttempts += attempts;

           		 System.out.print("Do you want to play again? (yes/no): ");
            		String playAgainResponse = sc.next().toLowerCase();
            		playAgain = playAgainResponse.equals("yes");
        	}while (playAgain);
		
		System.out.println("Game over! You won " + roundsWon + " round(s) with a total of " + totalAttempts + " attempts.");
    }
}
