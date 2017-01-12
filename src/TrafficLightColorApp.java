import java.util.Random;
import java.util.Scanner;

public class TrafficLightColorApp {
    public static void main(String[] args) {

        System.out.println("Rules of the intersection:");

        TrafficLightColor randomLightColor = TrafficLightColor.getRandom();

        makeDrivingDecision(randomLightColor);
    }

    private static void makeDrivingDecision(TrafficLightColor color) {
        if (color.equals(TrafficLightColor.GREEN)) {
            System.out.println("If the light is green, you may proceed on through the intersection.");
        } else if (color.equals(TrafficLightColor.YELLOW)) {
            System.out.println("If the light is yellow, prepare to stop by slowing down.");
        } else if (color.equals(TrafficLightColor.RED)) {
            System.out.println("If the light is red, you must stop completely. You may turn right after stopping completely, provied the way is clear of traffic.");
        }
    }
}
