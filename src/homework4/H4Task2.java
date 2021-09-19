package homework4;

import java.util.Scanner;

public class H4Task2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int a = 0;

        do {
            if (a % 3 != 0) {
                System.out.println(a);
            }
            a++;
        } while (a <= 16);
    }
}


