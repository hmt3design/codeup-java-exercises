import java.util.Scanner;

/**
 * Created by Harry on 1/5/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        System.out.println("Arithmetic functions");
        Scanner scan = new Scanner(System.in);
        float a = getNumber1(scan);
        float b = getNumber2(scan);
        float add = addFunction(a, b);
        float subtract = subFunction(a, b);
        float multiply = multFunction(a, b);
        float divide = divFunction(a, b);
        float modulus = modFunction(a, b);
        System.out.println("Addition: " + a + " + " + b + " = " + add);
        System.out.println("Subtraction: " + a + " - " + b + " = " + subtract);
        System.out.println("Multiplication: " + a + " * " + b + " = " + multiply);
        System.out.println("Division: " + a + " / " + b + " = " + divide);
        System.out.println("Modulus: " + a + " % " + b + " = " + modulus);
        System.out.println();
    }

    public static float getNumber1(Scanner scan) {
        System.out.println("Please enter your first number: ");
        return scan.nextInt();
    }

    public static float getNumber2(Scanner scan) {
        System.out.println("Please enter your second number: ");
        return scan.nextInt();
    }

    public static float addFunction(float num1, float num2) {
        float resultAdd = num1+num2;
        return resultAdd;
    }

    public static float subFunction(float num1, float num2) {
        float resultSub = num1-num2;
        return resultSub;
    }

    public static float multFunction(float num1, float num2) {
        float resultMult = num1*num2;
        return resultMult;
    }

    public static float divFunction(float num1, float num2) {
        float resultDiv = num1/num2;
        return resultDiv;
    }

    public static float modFunction(float num1, float num2) {
        float resultMod = num1%num2;
        return resultMod;
    }}