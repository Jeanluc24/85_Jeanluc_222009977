class ForLoop {
    public static void main(String args[]) {
        // Use a 'for' loop to iterate from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            // Print the current value of 'i' followed by a space.
            System.out.print(i + " ");

            // Check if the current value of 'i' is an even number using the 'isEven' function.
            if (isEven(i)) {
                // If 'i' is even, print that it is an even number.
                System.out.println("= is an Even number");
            } else {
                // If 'i' is not even, print that it is not an even number.
                System.out.println("= is not an Even number");
            }
        }
    }

    // Define a function 'isEven' that checks whether a number is even.
    public static boolean isEven(int num) {
        // Check if 'num' is even by verifying if it is divisible by 2 with no remainder.
        return num % 2 == 0;
    }
}
