import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Harry on 1/13/17.
 */
public class Console {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // for output

//    public void print(String s);
//
//    public void println(String s);
//
//    public void println();
//
//    // for input
//    public String getRequiredString(String prompt);
//
//    public String getChoiceString(String prompt, String s1, String s2);


//    public int getInt(String prompt) {
//        System.out.print(prompt);
//        int userInt;
//
//        try {
//            userInt = scan.nextInt();
//        } catch (InputMismatchException e) {
//            scan.next();
//            System.out.println("Input must be an integer");
//            return getInt(prompt);
//        }
//
//        return userInt;
//    }
//
//    public int getIntWithinRange(String prompt, int min, int max) {
//        int userInt = getInt(prompt);
//
//        try {
//            if (userInt < min || userInt > max) {
//                throw new IllegalArgumentException("Your input must be an integer between " + min + " and " + max);
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//            return getIntWithinRange(prompt, min, max);
//        }
//
//        return userInt;
//    }
//
//    public int getDouble(String prompt) {
//        System.out.print(prompt);
//        int userDouble;
//
//        try {
//            userDouble = scan.nextDouble();
//        } catch (InputMismatchException e) {
//            scan.next();
//            System.out.println("Input must be an integer");
//            return getDouble(prompt);
//        }
//
//        return userDouble;
//    }
//
//    public int getDoubleWithinRange(String prompt, int min, int max) {
//        int userDouble = getDouble(prompt);
//
//        try {
//            if (userDouble < min || userDouble > max) {
//                throw new IllegalArgumentException("Your input must be an integer between " + min + " and " + max);
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//            return getDoubleWithinRange(prompt, min, max);
//        }
//
//        return userDouble;
//    }
}
}
