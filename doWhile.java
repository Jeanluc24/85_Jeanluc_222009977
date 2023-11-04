public class doWhile {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input from the console.
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Declare a String variable to store the user's input command.
        String command;

        // Start a do-while loop that will continue until the user enters the "exit" command.
        do {
            // Prompt the user to enter a command.
            System.out.print("Enter a command (or 'exit' to quit): ");
            
            // Read the user's input and store it in the 'command' variable.
            command = scanner.nextLine();

            // Check if the user's input is "help" and display available commands.
            if (command.equalsIgnoreCase("help")) {
                System.out.println("Available commands:");
                System.out.println("1. sayHello - Prints 'Hello, World!'");
                System.out.println("2. currentTime - Displays the current time");
            }
            // Check if the user's input is "sayHello" and print a greeting.
            else if (command.equalsIgnoreCase("sayHello")) {
                System.out.println("Hello, World!");
            }
            // Check if the user's input is "currentTime" and display the current time.
            else if (command.equalsIgnoreCase("currentTime")) {
                System.out.println("Current time: " + java.time.LocalTime.now());
            }
            // Check if the user's input is "exit" to terminate the loop.
            else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the command-line interpreter.");
            }
            // If the user's input doesn't match any known command, provide an error message.
            else {
                System.out.println("Command not recognized. Type 'help' for a list of commands.");
            }

        } while (!command.equalsIgnoreCase("exit")); // Continue the loop until the user enters "exit."

        // Close the scanner to release resources.
        scanner.close();
    }
}
