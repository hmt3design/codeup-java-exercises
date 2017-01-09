import java.util.Scanner;

/**
 * Created by Harry on 1/6/17.
 */
public class HelloWorldPerson {
    public static void main(String[] args) {
        // create new Person object
        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;
        String eMail;

        System.out.println("Add the first new person:");
        System.out.println("First name: ");
        firstName = scan.nextLine();
        System.out.println("Last name: ");
        lastName = scan.nextLine();
        System.out.println("email address: ");
        eMail = scan.nextLine();
        Person addPerson1 = new Person(firstName, lastName, eMail);
        System.out.println("Hello, " + addPerson1.firstName + " " + addPerson1.lastName + ". We have your email as " + addPerson1.eMail + ". Your account number is: " + addPerson1);


        System.out.println("Add the second new person:");
        System.out.println("First name: ");
        firstName = scan.nextLine();
        System.out.println("Last name: ");
        lastName = scan.nextLine();
        System.out.println("email address: ");
        eMail = scan.nextLine();
        Person addPerson2 = new Person(firstName, lastName, eMail);
        System.out.println("Hello, " + addPerson2.firstName + " " + addPerson2.lastName + ". We have your email as " + addPerson2.eMail + ". Your account number is: " + addPerson2);
    }
}
