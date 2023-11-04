public class For {
    public static void main(String[] args) {
        // Create an array of strings representing dirty dishes.
        String[] dirtyDishes = {
            "Plate",
            "Cup",
            "Fork",
            "Knife",
            "Spoon",
            "Bowl"
        };

        // Display a message indicating that dirty dishes are being loaded into the dishwasher.
        System.out.println("Loading dirty dishes into the dishwasher...");

        // Use a 'for' loop to iterate through the 'dirtyDishes' array.
        for (int i = 0; i < dirtyDishes.length; i++) {
            // Get the current dish at index 'i'.
            String dish = dirtyDishes[i];

            // Check if the dish is a "Cup" and display a specific message for cups.
            if (dish.equals("Cup")) {
                System.out.println("Loading a cup into the dishwasher.");
            } else {
                // Display a general message for other types of dishes.
                System.out.println("Loading a " + dish + " into the dishwasher.");
            }
        }

        // Display a message indicating that all dirty dishes have been loaded into the dishwasher.
        System.out.println("All " + dirtyDishes.length + " dirty dishes have been loaded. You can start the dishwasher.");
    }
}
