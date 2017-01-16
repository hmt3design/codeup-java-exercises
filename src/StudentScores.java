import java.util.*;

/**
 * Created by Harry on 1/13/17.
 */
public class StudentScores {
    private String firstName;
    private String lastName;
    private double testScore;

    public StudentScores(String firstName, String lastName, double testScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScore = testScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Comparator for sorting the list by lastName
    public static Comparator<StudentScores> lastNameSort = new Comparator<StudentScores>() {

        public int compare(StudentScores studentScores1, StudentScores studentScores2) {
            String studentName1 = studentScores1.getLastName().toUpperCase();
            String studentName2 = studentScores2.getLastName().toUpperCase();
            //ascending order
            return studentName1.compareTo(studentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }
    };

    //Comparator for sorting the list by score
    public static Comparator<StudentScores> testScoreResults = new Comparator<StudentScores>() {

        public int compare(StudentScores studentScores1, StudentScores studentScores2) {

            double testScore1 = studentScores1.getTestScore();
            double testScore2 = studentScores2.getTestScore();

	   /*For ascending order*/
            return (int) testScore1 - (int) testScore2;

	   /*For descending order*/
            //return (int) testScore2 - (int) testScore1;
        }
    };

    @Override
    public String toString() {
        return "Test score: " + testScore + ", Name: " + getFullName();
    }
}
