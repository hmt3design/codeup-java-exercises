import java.util.Scanner;

/**
 * Created by Harry on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Circle calculator");
        System.out.println("");
        enterCircleData();
    }

    public static void enterCircleData() {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        Circle circle = new Circle();

        circle.radius = validator.getInt("Please enter the radius of your circle: ");
        System.out.println("The raw area of your circle is: " + circle.getArea());
        System.out.println("The refined area of your circle is: " + circle.getFormattedArea());
        System.out.println("The raw circumference of your circle is: " + circle.getCircumference());
        System.out.println("The refined circumference of your circle is: " + circle.getFormattedCircumference());
        System.out.println("");
        circle.getObjectCount();
        if (validator.addAnother() == true) {
            enterCircleData();
        } else System.out.println("You have created " + circle.counter + " circle(s).");
    }

}
