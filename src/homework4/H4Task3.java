package homework4;

import java.util.Scanner;

public class H4Task3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the 5 numbers");

        int sum = 0;
        int a;

        for (int i = 0; i < 5; i++) {
            a = inputScanner.nextInt();
            sum += a;
        }
        System.out.println("The sum of the numbers are: " + sum);
    }
}
