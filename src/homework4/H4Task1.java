package homework4;

import java.util.Scanner;

public class H4Task1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int input = inputScanner.nextInt();

        if (input < 0) {
            System.out.println("Invalid input");
            return;
        }

        int sum = 0;
        int n = 0;
        int a = 0;

        while (a <= input) {
            sum += a;
            a += 2;
            n++;
        }
        System.out.println("The arithmetic average of all the even numbers are: " + sum / n);

    }
}