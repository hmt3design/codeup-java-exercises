import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Harry on 1/9/17.
 */
public class ExceptionDemoInst {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Records App");
        System.out.println("Please input a new student.");

        String firstName = getString("First name: ");
        String lastName = getString("Last name: ");
        int age = getInt("Age: ");

        Students newStudent = newStudent(firstName, lastName, age);
        System.out.println(newStudent.getFirstName() + " " + newStudent.getLastName() + " is " + newStudent.getAge() + " years old.");
    }

    private static int getInt(String prompt, Scanner scan) {
        Scanner scan = new Scanner(System.in);
        int userInteger;

        System.out.println(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Age must be a number.");
            scan.next();
            return getInt(prompt, scan);
        }

        return userInteger;
    }

    public static String getString(String prompt, Scanner scan) {
        Scanner scan = new Scanner(System.in);
        String inputString;

        System.out.print(prompt);
        try {
            inputString = scan.nextLine()
        } catch (Exception e);
        {
            System.out.println();
            ("Error in input. Please try again.");
            scan.next();
            return getString(prompt, scan);
        }

        return inputString;
    }
}
