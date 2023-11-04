import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        // Create an array of strings representing a list of items.
        String[] items = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

        // Create a Scanner object for reading user input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an item to search for.
        System.out.print("Enter an item to search for: ");
        String searchTerm = scanner.nextLine();

        // Initialize a boolean variable 'found' to keep track of whether the item was found.
        boolean found = false;

        // Iterate through the 'items' array using a for-each loop.
        for (String item : items) {
            // Check if the current 'item' (case-insensitive) matches the 'searchTerm'.
            if (item.equalsIgnoreCase(searchTerm)) {
                // If a match is found, set 'found' to true, display the item, and break out of the loop.
                found = true;
                System.out.println("Item found: " + item);
                break;
            }
        }

        // After the loop, check if 'found' is still false, indicating the item was not found.
        if (!found) {
            System.out.println("Item not found in the list.");
        }

        // Close the Scanner to release resources.
        scanner.close();
    }
}
