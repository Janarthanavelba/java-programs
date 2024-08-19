/* Java program to Guess the Number */

import java.util.Random;
import java.util.Scanner;

 class GuessTheNumber 
 {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!win) {
            guess = obj.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) 
            {
                win = true;
            } else if (guess < numberToGuess)
             {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
        System.out.println("Congratulations! You've guessed the correct number in " + numberOfTries + " tries.");
    }
}
