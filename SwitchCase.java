public class SwitchCase {
    public static void main(String args[]) {
        // Declare an integer variable named 'choice' and assign the value 2 to it.
        int choice = 2;

        // Start a switch statement based on the value of 'choice'.
        switch (choice) {
            // If 'choice' is 1, execute the following code block.
            case 1:
                System.out.println("Circle");
                break;

            // If 'choice' is 2, execute the following code block.
            case 2:
                System.out.println("Rectangle");
                break;

            // If 'choice' is 3, execute the following code block.
            case 3:
                System.out.println("Square");
                break;

            // If 'choice' does not match any of the cases above, execute the following code block (default case).
            default:
                System.out.println("No choice");
        }
    }
}
