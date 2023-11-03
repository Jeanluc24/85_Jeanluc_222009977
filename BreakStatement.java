import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        String[] items = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an item to search for: ");
        String searchTerm = scanner.nextLine();

        boolean found = false;
        for (String item : items) {
            if (item.equalsIgnoreCase(searchTerm)) {
                found = true;
                System.out.println("Item found: " + item);
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found in the list.");
        }

        scanner.close();
    }
}
