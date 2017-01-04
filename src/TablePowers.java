import java.util.Scanner;

/**
 * Created by Harry on 1/4/17.
 */
public class TablePowers {
    public static void main(String[] args) {
        String userInput;
        String userWantsToContinue;
        Scanner sc = new Scanner(System.in);
        do {

            int userInt;
            System.out.print("Please input an integer: ");
            userInt = sc.nextInt();

            System.out.println("Root        | Square      | Cube      ");
            System.out.println("--------------------------------------");

            for (int i = 1; i <= userInt; i++) {
                System.out.printf("%12s", i);
                System.out.printf("%12s", (int) Math.pow(i, 2));
                System.out.printf("%12s", (int) Math.pow(i, 3));
                System.out.println();
            }

            System.out.print("Do you want to continue?");
            userInput = sc.next();
        } while (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the table powers app :)");
    }
}
