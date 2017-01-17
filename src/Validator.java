import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Harry on 1/9/17.
 */
public class Validator {

    private Scanner scan;

    public Validator(Scanner scan) {
        this.scan = scan;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        int userInt;

        try {
            userInt = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("Input must be an integer");
            return getInt(prompt);
        }

        return userInt;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInt = getInt(prompt);

        try {
            if (userInt < min || userInt > max) {
                throw new IllegalArgumentException("Your input must be an integer between " + min + " and " + max);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }

        return userInt;
    }

    public static boolean playerAgain() {
        System.out.println("Would you like to enter another player?");
        boolean playAgain = false;
        String userChoice;
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextLine();
        if ((userChoice.equalsIgnoreCase("yes")) || (userChoice.equalsIgnoreCase("y"))) {
            return true;
        } else if ((userChoice.equalsIgnoreCase("no")) || (userChoice.equalsIgnoreCase("n"))) {
            return false;
        }
        return playerAgain();
    }

    public static boolean playAgain() {
        System.out.println("Would you like to play again?");
        boolean playAgain = false;
        String userChoice;
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextLine();
        if ((userChoice.equalsIgnoreCase("yes")) || (userChoice.equalsIgnoreCase("y"))) {
            return true;
        } else if ((userChoice.equalsIgnoreCase("no")) || (userChoice.equalsIgnoreCase("n"))) {
            return false;
        }
        return playAgain();
    }

    public static boolean addAnother() {
        System.out.println("Would you like to add another?");
        boolean addAnother = false;
        String userChoice;
        Scanner scan = new Scanner(System.in);
        userChoice = scan.nextLine();
        if ((userChoice.equalsIgnoreCase("yes")) || (userChoice.equalsIgnoreCase("y"))) {
            return true;
        } else if ((userChoice.equalsIgnoreCase("no")) || (userChoice.equalsIgnoreCase("n"))) {
            return false;
        }
        return addAnother();
    }
}
