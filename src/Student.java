/**
 * Created by Harry on 1/13/17.
 */
public class Student implements Comparable <Student> {
    private String firstName;
    private String lastName;
    private double testScore;

//    public Student(String firstName, String lastName, double testScore);

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public double getTestScore() {return testScore;}

    public boolean equals(Student other) {
        return this.getTestScore() == other.getTestScore();
    }

    public String compareTo(Student other) {
        if (getTestScore() > other.getTestScore()) ;
        return 1;
    } else if (getTestScore() < other.getTestScore()){
        return -1;
    } else
        return 0;

    public String toString() {
        return "{lastName() + ", " + firstName() + ": " + testScore()}";
    }
}
