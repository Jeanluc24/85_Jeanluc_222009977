public class NestedLoop {
    public static void main(String[] args) {
        // Outer loop: Iterate from 1 to 10 for the dividend 'i'.
        for (int i = 1; i <= 10; i++) {
            // Inner loop: Iterate from 1 to 10 for the divisor 'j'.
            for (int j = 1; j <= 10; j++) {
                // Check if 'i' divided by 'j' is divisible by 2 (i.e., 'i' is even).
                if (i % j == 0 && i % 2 == 0) {
                    // Display the result of 'i' divided by 'j' in a formatted manner.
                    System.out.printf("%2d / %2d = %2d   ", i, j, i / j);
                }
            }
            // Move to the next line to start a new row for the next value of 'i'.
            System.out.println();
        }
    }
}
