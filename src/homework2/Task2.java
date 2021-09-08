package homework2;

public class Task2 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'X';
        char c = 'B';

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }


}

