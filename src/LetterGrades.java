import java.util.Scanner;

/**
 * Created by Harry on 1/4/17.
 */
public class LetterGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        String userWantsToContinue;
        String message;
        int grade;

        System.out.println("Welcome to the student grading application.");
        do {
            System.out.println("What is the student's numerical grade?");
            grade = sc.nextInt();

            if (grade >= 88) {
                message = "Student has recieved an A.";
            } else if (grade >=80) {
                message = "Student has recieved a B.";
            } else if (grade >=67) {
                message = "Student has recieved a C.";
            } else if (grade >=60) {
                message = "Student has recieved a D.";
            } else {
                message = "Student has recieved an F.";
            }

            System.out.println(message);
            System.out.print("Do you wish to grade another student?");

            userWantsToContinue = sc.next();

        } while (userWantsToContinue.equalsIgnoreCase("yes"));

    }



}
