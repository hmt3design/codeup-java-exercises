import java.util.Scanner;

/**
 * Created by Harry on 1/6/17.
 */
public class HelloWorldPerson {
    public static void main(String[] args) {
        // create new Person object
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the first new person:");
        Person addPerson1 = new Person();
        System.out.println("First name: ");
        addPerson1.firstName = scan.nextLine();
        System.out.println("Last name: ");
        addPerson1.lastName = scan.nextLine();
        System.out.println("email address: ");
        addPerson1.eMail = scan.nextLine();
        System.out.println("Hello, " + addPerson1.firstName + " " + addPerson1.lastName + ". We have your email as " + addPerson1.eMail + ". Your account number is: " + addPerson1);
        System.out.println("Add the second new person:");
        Person addPerson2 = new Person();
        System.out.println("First name: ");
        addPerson2.firstName = scan.nextLine();
        System.out.println("Last name: ");
        addPerson2.lastName = scan.nextLine();
        System.out.println("email address: ");
        addPerson2.eMail = scan.nextLine();
        System.out.println("Hello, " + addPerson2.firstName + " " + addPerson2.lastName + ". We have your email as " + addPerson2.eMail + ". Your account number is: " + addPerson2);
    }
}
