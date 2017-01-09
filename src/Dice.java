/**
 * Created by Harry on 1/6/17.
 */
public class Dice {
    int numberOfSides;
    int currentValue;

    // construct the die
    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    // roll the die
    public int roll() {
        // generate a random number between 1 and numberOFSides
        int random = (int) Math.ceil(Math.random() * numberOfSides);

        // update the current value
        currentValue = random;

        //return the random roll
        return currentValue;
    }
}