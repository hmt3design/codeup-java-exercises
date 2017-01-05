import java.util.Scanner;

/**
 * Created by Harry on 1/5/17.
 * Factorials are calculated by the formula n! = n x (n-1)!
 *
 */
public class Factorial {
    public static void main(String args[]) {
        System.out.println("Factorial calculation");
        Scanner scan = new Scanner(System.in);
        int n = getNumber(scan);

        for (int counter = 1; counter <= n; counter++) {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
    }

    public static int getNumber(Scanner scan) {
        System.out.println("Please enter a whole number between 1 and 10: ");
        return scan.nextInt();
    }

    public static long factorial(long number) {
        if (number <= 1) return 1;
        else return number * factorial(number - 1);
    }
}