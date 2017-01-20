import Validator.Validator;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Harry on 1/12/17.
 */
public class HighLowGame {
    public static void main(String[] args) {
        System.out.println("High-Low Guessing Game");
        System.out.println("The System will pick a number between 1 and 100. You must guess the number!");
        System.out.println("If you are too low, the System will tell you to guess higher.");
        System.out.println("If you are too high, the System will tell you to guess lower.");
        System.out.println("Good luck!");
        System.out.println("");
        startGame();
    }

    public static void startGame() {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        Random random = new Random();

        int numberSystem = random.nextInt(100);
        int guess = -1;
        int counter = 0;
        System.out.println("The System has picked a number!");

        while (guess != numberSystem) {
            System.out.println("Enter your guess: ");
            guess = scan.nextInt();
            if (guess < numberSystem) {
                System.out.println("Too low; please enter a higher number: ");
                counter++;
            } else if (guess > numberSystem) {
                System.out.println("Too high; please enter a lower number: ");
                counter++;
            } else System.out.println("Excellent. You guessed the number in " + counter + " guesses!");
            System.out.println("");
            if (validator.playAgain() == true) {
                startGame();
            }
        }

    }
}