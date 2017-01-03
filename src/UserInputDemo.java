import java.util.Scanner;

/**
 * Created by Harry on 1/3/17.
 */
public class Demo {
    public static void main(String[] args) {
        int userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input an integer: ");
        userInput = sc.nextInt();

        System.out.println("You entered: " + userInput);
    }
}
