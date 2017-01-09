import java.util.Scanner;

/**
 * Created by Harry on 1/9/17.
 */
public class DiceRollingApp {
    public static void main(String[] args) {
        // prompt the user for number of sides
        // roll two dice with that number of sides
        // output the sum of both dice

        Scanner scan = new Scanner(System.in);
        String userChoice = "no";
        System.out.println("Welcome to the dice rolling epp");
        do {
            rollTwoDice(scan);
            System.out.println("Do you wish to continue? Type 'yes' or 'no'");
            userChoice = scan.next();
        } while (userChoice.equalsIgnoreCase("yes"));

    }
        public static void rollTwoDice(Scanner scan){
            int numberOfSides;

        // prompt the user for numberOfSides
        System.out.print("How many sides should the dice have?");
        numberOfSides = scan.nextInt();

            //roll two dice with that numberOfSides
        Dice firstDie = new Dice(numberOfSides);
        Dice secondDie = new Dice(numberOfSides);
        firstDie.roll();
        secondDie.roll();

            // output the sum of both
        System.out.println("You rolled a " + firstDie.currentValue + " and a " + secondDie.currentValue + ", making a total of " + (firstDie.currentValue + secondDie.currentValue) + ".");

    }

}
