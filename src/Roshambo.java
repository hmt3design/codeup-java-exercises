/**
 * Created by Harry on 1/19/17.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    public static Roshambo fromNumber(int number) {
        if (number == 1) {
            return ROCK;
        } else if (number == 2) {
            return PAPER;
        } else {
            return SCISSORS;
        }
    }

    public static Roshambo fromString(String letter) {
        switch (letter) {
            case "R":
                return ROCK;
            case "P":
                return PAPER;
            default:
                return SCISSORS;
        }
    }

    @Override
    public String toString() {
        return Character.toString(super.toString().charAt(0));
    }
}

