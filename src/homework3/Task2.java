package homework3;

public class Task2 {
    public static void main(String[] args) {
        if (args.length > 0) {

            String selectedFloor = args[0];

            switch (selectedFloor) {
                case "1": case "2": case "3": case "4": case "5":
                    System.out.println("Going to floor " + selectedFloor);
                    break;
                default:
                    System.out.println("Invalid floor");
            }

        } else {
            System.out.println("No floor is provided");
        }
    }
}
