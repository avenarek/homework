package homework2;

public class Task3 {
    public static void main(String[] args) {
        boolean redIsHitFromBehind = true;
        boolean blackIsHitFromBehind = false;

        if (redIsHitFromBehind && !blackIsHitFromBehind) {
            System.out.println("black");
        } else if (!redIsHitFromBehind && blackIsHitFromBehind) {
            System.out.println("red");
        } else {
            System.out.println("Invalid state");
        }
    }
}

