package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        System.out.print("Write first number: ");
        num1 = inputScanner.nextDouble();

        System.out.print("Write second number: ");
        num2 = inputScanner.nextDouble();

        System.out.print("Write the operation: ");
        operator = inputScanner.next();

        System.out.println();

        switch (operator) {
            case "a":
                System.out.println(num1 + num2);
                break;
            case "s":
                System.out.println(num1 - num2);
                break;
            case "m":
                System.out.println(num1 * num2);
                break;
            case "d":
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}