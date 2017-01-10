import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by Harry on 1/9/17.
 */
public class Validator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }

    public int getInt(String prompt, Scanner scan) {
        int userInteger;
        System.out.print(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer.");
            scan.next();
            return getInt(prompt, scan);
        }
        return userInteger;
    }

//    public int getIntWithinRange(String prompt, int min, int max) {
//        int userInteger;
//        System.out.print(prompt);
//
//    }
}

