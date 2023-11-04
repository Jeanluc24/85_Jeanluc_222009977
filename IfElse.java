class IfElse {
    public static void main(String args[]) {
        // Declare and initialize an integer variable 'number' with the value 22.

        int number = 22;

        // Check the value of 'number' against a range of conditions using if-else if statements.

        if (number < -10) {
            // If 'number' is less than -10, print "Negative."
            System.out.println("Negative");
        } else if (number >= -10 && number < 0) {
            // If 'number' is greater than or equal to -10 and less than 0, print "Cold."
            System.out.println("Cold");
        } else if (number >= 0 && number < 10) {
            // If 'number' is greater than or equal to 0 and less than 10, print "Cool."
            System.out.println("Cool");
        } else if (number >= 10 && number < 20) {
            // If 'number' is greater than or equal to 10 and less than 20, print "Positive."
            System.out.println("Positive");
        } else if (number >= 20 && number < 30) {
            // If 'number' is greater than or equal to 20 and less than 30, print "Warm."
            System.out.println("Warm");
        } else {
            // If 'number' doesn't match any of the previous conditions, print "Invalid number."
            System.out.println("Invalid number");
        }
    }
}
