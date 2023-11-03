public class For {
    public static void main(String[] args) {
        String[] dirtyDishes = {
                "Plate",
                "Cup",
                "Fork",
                "Knife",
                "Spoon",
                "Bowl"
        };

        System.out.println("Loading dirty dishes into the dishwasher...");

        for (int i = 0; i < dirtyDishes.length; i++) {
            String dish = dirtyDishes[i];
            if (dish.equals("Cup")) {
                System.out.println("Loading a cup into the dishwasher.");
            } else {
                System.out.println("Loading a " + dish + " into the dishwasher.");
            }
        }

        System.out
                .println("All " + dirtyDishes.length + " dirty dishes have been loaded. You can start the dishwasher.");
    }
}
