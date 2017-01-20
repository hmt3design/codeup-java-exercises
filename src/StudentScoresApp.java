import Validator.Validator;

import java.util.*;

/**
 * Created by Harry on 1/16/17.
 */
public class StudentScoresApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        StudentScores student1 = new StudentScores("Harry", "Thomas", 88);
        StudentScores student2 = new StudentScores("Jane", "Doe", 75);
        StudentScores student3 = new StudentScores("Pat", "Patterson", 62);

        // array list of StudentScores
        ArrayList<StudentScores> students = new ArrayList<StudentScores>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //Sorting based on student name
        System.out.println("Student name sorting:");
        Collections.sort(students, StudentScores.lastNameSort);

        for(StudentScores studentScores : students){
            System.out.println(studentScores.getFullName() + " scored a " + studentScores.getTestScore());
        }

        // Sorting on testScore property*/
        System.out.println("");
        System.out.println("Test score sorting:");
        Collections.sort(students, StudentScores.testScoreResults);
        for(StudentScores studentScores : students){
            System.out.println(studentScores);
        }
    }
}
