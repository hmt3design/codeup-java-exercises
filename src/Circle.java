import java.util.*;

/**
 * Created by Harry on 1/17/17.
 */
public class Circle {
    double radius;
    double pi = Math.PI;
    double circleArea;
    double circleCircumference;
    int counter = 0;

    public double getArea() {
        circleArea = pi * (radius * radius);
        return circleArea;
    }

    public double getFormattedArea() {
        circleArea = circleArea * 100;
        circleArea = (int) circleArea;
        circleArea = circleArea / 100;
        return circleArea;
    }

    public double getCircumference() {
        circleCircumference = 2 * (pi * radius);
        return circleCircumference;
    }

    public double getFormattedCircumference(){
        circleCircumference = circleCircumference * 100;
        circleCircumference = (int) circleCircumference;
        circleCircumference = circleCircumference / 100;
        return circleCircumference;
    }

//
//    private String formatNumber(double x);
//
    public int getObjectCount() {
        int objectCount = counter++;
        return objectCount;
    }

}

