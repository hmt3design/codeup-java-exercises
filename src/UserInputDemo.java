import java.util.Scanner;

/**
 * Created by Harry on 1/3/17.
 */
public class UserInputDemo {
    public static void main(String[] args) {
        int userInt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        userInt = sc.nextInt();
        System.out.println("You entered: " + userInt);

        String userStr;
        System.out.print("Please enter a sentence: ");
        userStr = sc.nextLine();
        System.out.println("You entered: " +  userStr);

        String userWord1;
        System.out.print("Please enter your first word: ");
        userWord1 = sc.nextLine();
        String userWord2;
        System.out.print("Please enter your second word: ");
        userWord2 = sc.nextLine();
        String userWord3;
        System.out.print("Please enter your third word: ");
        userWord3 = sc.nextLine();
        System.out.println("First word: " + userWord1);
        System.out.println("Second word: " + userWord2);
        System.out.println("Third word: " + userWord3);

        System.out.println("Perimeter and area calculator");
        int userLength;
        System.out.print("Please enter the length of the room: ");
        userLength = sc.nextInt();
        int userWidth;
        System.out.print("Please enter the width of the room: ");
        userWidth = sc.nextInt();
        System.out.println("The perimeter of the room is " + (2 * (userLength + userWidth)));
        System.out.println("The area of the room is " + userLength * userWidth);
        }
    }

