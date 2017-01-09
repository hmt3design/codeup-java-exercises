import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Harry on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Student database");
        String firstName;
        String lastName;
        int age = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        lastName = scan.nextLine();

        try {
            System.out.println("Enter age: ");
            age = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.next();  // discard the incorrectly entered age
            System.out.println("Please enter a valid age.");
            age = scan.nextInt();
        }

        Students addStudent = new Students(firstName, lastName, age);
        System.out.println("First name: " + addStudent.firstName);
        System.out.println("Last name: " + addStudent.lastName);
        System.out.println("Age: " + addStudent.age);
    }
}
