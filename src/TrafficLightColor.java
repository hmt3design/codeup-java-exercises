/**
 * Created by Harry on 1/12/17.
 */

public enum TrafficLightColor {
    GREEN, YELLOW, RED;

    public static TrafficLightColor getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
