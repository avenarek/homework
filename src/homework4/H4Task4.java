package homework4;

import java.util.Scanner;

public class H4Task4 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = inputScanner.nextInt();

        if (input < 0) {

            System.out.println("Invalid input");
            return;
        }

        System.out.println("The cube of each number up until the input number: ");

        for (int i = 0; i <= input; i++) {
            System.out.println(i * i * i);
        }

    }
}
