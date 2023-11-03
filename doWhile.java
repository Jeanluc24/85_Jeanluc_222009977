public class doWhile {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String command;

        do {
            System.out.print("Enter a command (or 'exit' to quit): ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("help")) {
                System.out.println("Available commands:");
                System.out.println("1. sayHello - Prints 'Hello, World!'");
                System.out.println("2. currentTime - Displays the current time");
            } else if (command.equalsIgnoreCase("sayHello")) {
                System.out.println("Hello, World!");
            } else if (command.equalsIgnoreCase("currentTime")) {
                System.out.println("Current time: " + java.time.LocalTime.now());
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the command-line interpreter.");
            } else {
                System.out.println("Command not recognized. Type 'help' for a list of commands.");
            }

        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
