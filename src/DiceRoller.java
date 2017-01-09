import java.util.Scanner;

/**
 * Created by Harry on 1/6/17.
 */
public class DiceRoller {
    public static void main(String[] args) {
        System.out.println("Dice Roller App");
        playGame();
    }

    public static void playGame() {
        boolean playAgain = false;
        String userChoice;
        Scanner scan = new Scanner(System.in);
        do {
            int numberOfSides = getNumberOfSides();
            System.out.println("You have a " + numberOfSides + " sided die.");

            int die1 = rollDie(numberOfSides);
            int die2 = rollDie(numberOfSides);
            System.out.println("You rolled a " + die1 + " and a " + die2 + ", which totals " + (die1 + die2));
            System.out.println("Do you want to roll again?");
            userChoice = scan.nextLine();
            if ((userChoice.equalsIgnoreCase("yes")) || (userChoice.equalsIgnoreCase("y"))) {
                playAgain = true;
            }
        } while(playAgain);
    }

    public static int rollDie(int numberOfSides) {
        return (int) Math.ceil(Math.random() * numberOfSides);
    }

    public static int getNumberOfSides() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many sides does your dice have?");
        return scan.nextInt();
    }
}
